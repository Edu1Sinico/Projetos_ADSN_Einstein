Trabalho feito por: Eduardo Silva Sinico e Gustavo de Arruda Carvalho Basso

**PROJETO: SIMULADOR DE FILA DE ATENDIMENTO**
-
Esse projeto, desenvolvido em Java, consiste em um sistema que gerencia o processo de filas e atendimentos de clietes (comuns ou
prioritários) para um fluxo bancário. O sistema utiliza dois tipos de estrutura de dados principais: filas, para organizar o de 
fluxo de clientes, e pilhas, para armazenar o histórico de atendimentos.

**FUNCIONALIDADES PRINCIPAIS**
- Realizar o cadastro de clientes:
  - Inserção do nome e do tipo de atendimento (comum ou prioritário).
- Gerenciamento de filas:
  - Inserção de clientes em suas respectivas filas (comum e prioritários);
  - Clientes prioritários têm preferência no atendimento (idosos, gestantes e PCDs);
  - Clientes comuns são destinados a operações gerais (saques, depósitos, etc).
- Chamar próximo cliente:
  - Prioriza os clientes prioritários;
  - Remove o cliente da fila;
  - Verifica a disponibilidade dos atendentes;
  - Verifica se há clientes na fila;
  - Registra o atendimento no histórico;
  - Informa qual cliente está sendo atendido e por qual atendente.
- Desfazer último atendimento:
    - Retorna o cliente para sua respectiva fila;
    - Altera a disponibilidade do atendente;
    - Informa qual atendimento foi desfeito;
    - Verifica se o histórico de atendimentos não está vazio.
- Gerar relatório:
    - Exibe a quantidade total de atendentes;
    - Exibe a quantidade de atendentes ocupados;
    - Exibe a quantidade de clientes atendidos;
    - Exibe a quantidade de clientes na fila comum;
    - Exibe a quantidade de clientes na fila prioritária.

**ESTRUTURA DO PROJETOS**
- Clientes: Representação do cliente da fila, com atributos como nome, prioridade e tipo de atendimento;
- Atendente: Representação do atendente, como atributos como nome e disponibilidade;
- FilaEncadeada: Estrutura para gerenciar os clientes na fila que aguardam o atendimento;
- PilhaEncadeada: Estrutura para gerenciar e armazenar o histórico de atendimentos realizados;
- SistemaAtendimento: Contém a lógica principal do sistema de atendimento, incluindo:
    - Adicionar o atendente;
    - Verificar se o atendente está disponível;
    - Adicionar cliente para a fila;
    - Chamar próximo cliente; 
    - Desfazer atendimento;
    - Gerar um relatório.
- Funcoes: Conjunto de métodos auxiliares para validação de dados (ex.: leitura e validação de números inteiros).