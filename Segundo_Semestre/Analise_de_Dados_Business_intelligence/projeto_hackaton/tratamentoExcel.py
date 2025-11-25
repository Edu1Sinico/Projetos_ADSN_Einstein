# Importando as bibliotecas
import pandas as pd

# pd.set_option('display.max_rows', None)      # mostra todas as linhas
# pd.set_option('display.max_columns', None)   # mostra todas as colunas
# pd.set_option('display.width', None)         # ajusta largura automaticamente
# pd.set_option('display.max_colwidth', None)  # mostra colunas longas por completo

# Leitura de todas as planilhas do arquivo Excel
todas_as_planilhas = pd.read_excel('eOuve - Limeira.xlsx', sheet_name=None)

# for nome, df in todas_as_planilhas.items():
#     print("Planilha:", nome)
#     print(df)

# Separando as planilhas em variáveis
secretaria = todas_as_planilhas["Secret_categ"]
assuntos = todas_as_planilhas["Assuntos_categ"]
bairro = todas_as_planilhas["Bairro_categ"]
tipo_categoria =  todas_as_planilhas["Secret_categ"]
tipo_status = todas_as_planilhas["Secret_status"]
categoria_temporaria = todas_as_planilhas["Assuntos_categ"]

# Realizando o tratamento de dados nas tabelas de secretaria, assuntos e bairros

# Secretaria
secretaria.columns = secretaria.iloc[0] # Converte a primeira linha como cabeçalho
secretaria = secretaria[1:] # Remove a primeira linha

# Assuntos
assuntos.columns = assuntos.iloc[0] # Converte a primeira linha como cabeçalho
assuntos = assuntos[1:] # Remove a primeira linha

# Bairro
bairro.columns = bairro.iloc[0] # Converte a primeira linha como cabeçalho
bairro = bairro[1:] # Remove a primeira linha

# Tipo Categoria
tipo_categoria.columns = tipo_categoria.iloc[0] # Converte a primeira linha como cabeçalho
tipo_categoria = tipo_categoria[1:] # Remove a primeira linha

# Tipo Status
tipo_status.columns = tipo_status.iloc[0] # Converte a primeira linha como cabeçalho
tipo_status = tipo_status[1:] # Remove a primeira linha

# # Categoria
categoria_temporaria.columns = categoria_temporaria.iloc[0] # Remove o cabeçalho atual
categoria_temporaria = categoria_temporaria[1:] # Remove a primeira linha

# Removendo colunas
secretaria = secretaria.drop(columns=["Denúncia","Doação","Elogio","Informação","Reclamação","Simplifique","Solicitação","Sugestão","Total"])
assuntos = assuntos.drop(columns=["Denúncia","Doação","Elogio","Informação","Reclamação","Simplifique","Solicitação","Sugestão","Total"])
bairro = bairro.drop(columns=["Denúncia","Doação","Elogio","Informação","Reclamação","Simplifique","Solicitação","Sugestão","Total"])
tipo_categoria = tipo_categoria.drop(columns=["Secretaria","Total"])
tipo_status = tipo_status.drop(columns=["Secretaria","Total"])

# Tabela fato (Categoria):

categoria_temporaria = categoria_temporaria.drop(columns=["Assunto","Total"])
categoria_temporaria = categoria_temporaria.drop(index=[144])

# Remover linha especifica pelo indíce (última linha de cada tabela)c
secretaria = secretaria.drop(index=[18])
assuntos = assuntos.drop(index=[144])
bairro = bairro.drop(index=[270])
tipo_categoria = tipo_categoria.iloc[0:0]
tipo_status = tipo_status.iloc[0:0]

# Renomeando os nomes das colunas "Secretaria", "Assunto" e "Bairro"
secretaria = secretaria.rename(columns={"Secretaria" : "Nome_Secretaria"})
assuntos = assuntos.rename(columns={"Assunto" : "Descrição_Assunto"})
bairro = bairro.rename(columns={"Bairro" : "Nome_Bairro"})

# Transformando as colunas em linhas para as tabelas "tipo_categoria" e "tipo_status" e 

# Tipo Categoria
tipo_categoria = pd.DataFrame({
    "Nome_Tipo_Categoria": tipo_categoria.columns
})

# Tipo Status
tipo_status = pd.DataFrame({
    "Nome_Tipo_Status": tipo_status.columns
})

# Criar uma nova coluna para id e autoincremental
secretaria["ID_Secretaria"] = range(1, len(secretaria) + 1) # Ele começa do valor "1", verifica o tamanho  da tabela e incremental de 1 e 1
assuntos["ID_Assunto"] = range(1, len(assuntos) + 1)
bairro["ID_Bairro"] = range(1, len(bairro) + 1)
tipo_categoria["ID_Tipo_Categoria"] = range(1, len(tipo_categoria) + 1)
tipo_status["ID_Tipo_Status"] = range(1, len(tipo_status) + 1)

# Tratando os problemas de quebras 

# Adicionando uma ligação entras as tabelas "Secretaria" e "Assuntos"

assuntos["Descrição_Assunto"] = (
    assuntos["Descrição_Assunto"]
    .astype(str)
    .str.replace("\n", " ", regex=False)
    .str.strip()
)

secretaria["Nome_Secretaria"] = (
    secretaria["Nome_Secretaria"]
    .astype(str)
    .str.replace("\n", " ", regex=False)
    .str.strip()
)

# Método para encontrar e comparar as colunas "Nome_Secretaria" com os dados da coluna "Descrição_Assunto"
def encontrar_secretaria(descricao):
    descricao_lower = str(descricao).lower() #Define todos os
    for sec in secretaria["Nome_Secretaria"]: # Armazena todos os valores da coluna "Nome_Secretaria" em uma variável temporária.
        if str(sec).lower() in descricao_lower: # Verifica se o valor enviado é similar ao valor da coluna "nome_secretaria"
            return sec
    return None


# Criar uma nova coluna utilizando o método de "encontrar_secretaria", comparando com cada campo da coluna "descrição_assuntos"
assuntos["Nome_Secretaria"] = assuntos["Descrição_Assunto"].apply(encontrar_secretaria)

# Cria uma união entre a tabela "assuntos" e "secretaria"
assuntos = assuntos.merge(
    secretaria[["ID_Secretaria", "Nome_Secretaria"]], # Busca as colunas "ID_Secretaria" e "Nome_Secretaria" para
    on="Nome_Secretaria", # Utiliza o "nome_secretaria" como chave de ligação entre as duas tabelas
    how="left"
)

assuntos = assuntos.drop(columns=["Nome_Secretaria"])

# -------------------------------------
# 1. Garantir que o índice da tabela de assuntos é ID_Assunto
# -------------------------------------
# Remover duplicação
assuntos = assuntos.reset_index(drop=True)

# Criar um ID_Assunto sequencial
assuntos["ID_Assunto"] = assuntos.index + 1

# Garantir que não existam duplicações
assuntos = assuntos.loc[:, ~assuntos.columns.duplicated()]


# -------------------------------------
# 2. Transformar categoria_temporaria em formato LONGO
# -------------------------------------
categoria_long = categoria_temporaria.reset_index().rename(columns={"index": "ID_Assunto"})
categoria_long["ID_Assunto"] = categoria_long["ID_Assunto"] + 1

categoria_long = categoria_long.melt(
    id_vars=["ID_Assunto"],
    var_name="Nome_Tipo_Categoria",
    value_name="Quantidade"
)

# Remover valores vazios ou zero
categoria_long = categoria_long[categoria_long["Quantidade"] > 0]

# -------------------------------------
# 3. Associar ID_Tipo_Categoria pelo nome
# -------------------------------------
categoria_long = categoria_long.merge(
    tipo_categoria[["ID_Tipo_Categoria", "Nome_Tipo_Categoria"]],
    on="Nome_Tipo_Categoria",
    how="left"
)

# -------------------------------------
# 4. Trazer o ID_Secretaria para cada ID_Assunto
# -------------------------------------
categoria_long = categoria_long.merge(
    assuntos[["ID_Assunto", "ID_Secretaria"]],
    on="ID_Assunto",
    how="left"
)

# -------------------------------------
# 5. Selecionar somente as colunas finais
# -------------------------------------
categoria = categoria_long[[
    "ID_Assunto",
    "ID_Secretaria",
    "ID_Tipo_Categoria",
    "Quantidade"
]].sort_values(["ID_Assunto", "ID_Tipo_Categoria"])




# # Exibir as planilhas tratadas
print("Tabela Secretaria:")
print(secretaria)

print("\nTabela Assuntos:")
print(assuntos)

print("\nTabela Bairros:")
print(bairro)

print("\nTabela Tipo Categoria:")
print(tipo_categoria)

print("\nTabela Tipo Status:")
print(tipo_status)

print("\nCategoria:")
print(categoria)