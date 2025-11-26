# ============================================
# IMPORTAÇÕES
# ============================================
import pandas as pd
from sqlalchemy import create_engine

# ============================================
# CONFIGURAÇÕES OPCIONAIS DE VISUALIZAÇÃO
# ============================================
pd.set_option('display.max_rows', None)
pd.set_option('display.max_columns', None)
pd.set_option('display.width', None)
pd.set_option('display.max_colwidth', None)


# ============================================
# FUNÇÕES AUXILIARES
# ============================================

def limpar_quebras(texto):
    """Remove quebras de linha e espaços extras."""
    return str(texto).replace("\n", " ").strip()


def encontrar_secretaria(descricao, lista_secretarias):
    """Encontra a secretaria correspondente dentro da descrição do assunto."""
    descricao_lower = str(descricao).lower()
    for sec in lista_secretarias:
        if str(sec).lower() in descricao_lower:
            return sec
    return None


def preparar_tabela(df, nome_coluna_principal, colunas_remover):
    """Define cabeçalho, remove lixo e renomeia coluna principal."""
    df.columns = df.iloc[0]
    df = df[1:]
    df = df.drop(columns=colunas_remover)
    df = df.rename(columns={nome_coluna_principal: f"Nome_{nome_coluna_principal}"})
    df[f"Nome_{nome_coluna_principal}"] = df[f"Nome_{nome_coluna_principal}"].apply(limpar_quebras)
    return df


# ============================================
# LEITURA DO EXCEL
# ============================================
todas_as_planilhas = pd.read_excel("\eOuve - Limeira.xlsx", sheet_name=None)

secretaria = todas_as_planilhas["Secret_categ"]
assuntos = todas_as_planilhas["Assuntos_categ"]
bairro = todas_as_planilhas["Bairro_categ"]
tipo_categoria = todas_as_planilhas["Secret_categ"]
tipo_status = todas_as_planilhas["Secret_status"]
categoria_temporaria = todas_as_planilhas["Assuntos_categ"]
manifesto_sigiloso_temp = todas_as_planilhas["SigilosPorCateg"]


# ============================================
# TRATAMENTO DAS DIMENSÕES PRINCIPAIS
# ============================================

secretaria = preparar_tabela(
    secretaria,
    nome_coluna_principal="Secretaria",
    colunas_remover=["Denúncia","Doação","Elogio","Informação","Reclamação",
                     "Simplifique","Solicitação","Sugestão","Total"]
)

assuntos = preparar_tabela(
    assuntos,
    nome_coluna_principal="Assunto",
    colunas_remover=["Denúncia","Doação","Elogio","Informação","Reclamação",
                     "Simplifique","Solicitação","Sugestão","Total"]
)

bairro = preparar_tabela(
    bairro,
    nome_coluna_principal="Bairro",
    colunas_remover=["Denúncia","Doação","Elogio","Informação","Reclamação",
                     "Simplifique","Solicitação","Sugestão","Total"]
)


# ============================================
# REMOVER ÚLTIMAS LINHAS LIXO
# ============================================
secretaria = secretaria.drop(index=[1, 18])
assuntos = assuntos.drop(index=[1, 144])
bairro = bairro.drop(index=[270])


# ============================================
# TRATAMENTO TIPO CATEGORIA e TIPO STATUS
# ============================================
tipo_categoria.columns = tipo_categoria.iloc[0]
tipo_categoria = tipo_categoria[1:]
tipo_categoria = tipo_categoria.drop(columns=["Secretaria", "Total"])
tipo_categoria = pd.DataFrame({"Nome_Tipo_Categoria": tipo_categoria.columns})

tipo_status.columns = tipo_status.iloc[0]
tipo_status = tipo_status[1:]
tipo_status = tipo_status.drop(columns=["Secretaria", "Total"])
tipo_status = pd.DataFrame({"Nome_Tipo_Status": tipo_status.columns})


# ============================================
# GERAR IDs AUTOINCREMENTAIS
# ============================================
secretaria["ID_Secretaria"] = range(1, len(secretaria) + 1)
assuntos["ID_Assunto"] = range(1, len(assuntos) + 1)
bairro["ID_Bairro"] = range(1, len(bairro) + 1)
tipo_categoria["ID_Tipo_Categoria"] = range(1, len(tipo_categoria) + 1)
tipo_status["ID_Tipo_Status"] = range(1, len(tipo_status) + 1)


# ============================================
# CRUZAR ASSUNTOS → SECRETARIA
# ============================================
assuntos["Nome_Secretaria"] = assuntos["Nome_Assunto"].apply(
    lambda x: encontrar_secretaria(x, secretaria["Nome_Secretaria"])
)

assuntos = assuntos.merge(
    secretaria[["ID_Secretaria", "Nome_Secretaria"]],
    on="Nome_Secretaria",
    how="left"
)

assuntos = assuntos.drop(columns=["Nome_Secretaria"])


# ============================================
# CRIAÇÃO DA TABELA FATO CATEGORIA
# ============================================

# Ajustar categoria temporária
categoria_temporaria.columns = categoria_temporaria.iloc[0]
categoria_temporaria = categoria_temporaria[1:]
categoria_temporaria = categoria_temporaria.drop(columns=["Assunto","Total"])
categoria_temporaria = categoria_temporaria.drop(index=[1,144])

# Formato longo
categoria_long = categoria_temporaria.reset_index().rename(columns={"index": "ID_Assunto"})
categoria_long["ID_Assunto"] = categoria_long["ID_Assunto"] - 1

categoria_long = categoria_long.melt(
    id_vars=["ID_Assunto"],
    var_name="Nome_Tipo_Categoria",
    value_name="Quantidade"
)

categoria_long = categoria_long[categoria_long["Quantidade"] > 0]

# Adicionar ID_Tipo_Categoria
categoria_long = categoria_long.merge(
    tipo_categoria,
    on="Nome_Tipo_Categoria",
    how="left"
)

# Adicionar ID_Secretaria
categoria_long = categoria_long.merge(
    assuntos[["ID_Assunto", "ID_Secretaria"]],
    on="ID_Assunto",
    how="left"
)

# Tabela fato final
categoria = categoria_long[[
    "ID_Assunto",
    "ID_Secretaria",
    "ID_Tipo_Categoria",
    "Quantidade"
]].sort_values(["ID_Assunto", "ID_Tipo_Categoria"])





# ============================================
# CRIAÇÃO TABELA FATO MANIFESTO SIGILOSO
# ============================================

manifesto_sigiloso_temp.columns = manifesto_sigiloso_temp.iloc[0]
manifesto_sigiloso_temp = manifesto_sigiloso_temp[1:]
manifesto_sigiloso_temp = manifesto_sigiloso_temp.drop(columns=["Secretaria","Total"])
manifesto_sigiloso_temp = manifesto_sigiloso_temp.drop(index=[1,144])

manifesto_long = manifesto_sigiloso_temp.reset_index().rename(columns={"index": "ID_Assunto"})
manifesto_long["ID_Assunto"] = manifesto_long["ID_Assunto"] - 1

manifesto_long = manifesto_long.melt(
    id_vars=["ID_Assunto"],
    var_name="Nome_Tipo_Categoria",
    value_name="Quantidade"
)

manifesto_long = manifesto_long[manifesto_long["Quantidade"] > 0]

# Adicionar ID_Tipo_Categoria
manifesto_long = manifesto_long.merge(
    tipo_categoria,
    on="Nome_Tipo_Categoria",
    how="left"
)

# Adicionar ID_Secretaria
manifesto_long = manifesto_long.merge(
    assuntos[["ID_Assunto", "ID_Secretaria"]],
    on="ID_Assunto",
    how="left"
)

# Tabela fato final
manifesto_sigiloso = manifesto_long[[
    "ID_Assunto",
    "ID_Secretaria",
    "ID_Tipo_Categoria",
    "Quantidade"
]].sort_values(["ID_Assunto", "ID_Tipo_Categoria"])





# ============================================
# CRIAÇÃO DA TABE LA FATO STATUS
# ============================================





# ============================================
# EXIBIR RESULTADOS
# ============================================
print("\nTabela Secretaria:")
print(secretaria)

print("\nTabela Assuntos:")
print(assuntos)

print("\nTabela Bairros:")
print(bairro)

print("\nTabela Tipo Categoria:")
print(tipo_categoria)

print("\nTabela Tipo Status:")
print(tipo_status)

print("\nTabela FATO - Categoria:")
print(categoria)

print("\nTabela FATO - Manifesto Sigiloso:")
print(manifesto_sigiloso)

# ============================================
# IMPORTAÇÃO DAS TABELAS PARA O SQL SERVER
# ============================================

