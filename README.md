# Forum Hub

### Desafio 04 - Curso One-Alura
Programa desenvolvido durante o curso One da plataforma Alura, utilizando framework Spring do Java e banco de dados, alem de conter sistema de segurança por token.<br>

<br>

## Funcionalidades

Este projeto apresenta uma API RESTful para o gerenciamento de tópicos, com as seguintes funcionalidades:

- **Cadastrar tópicos:** Permitir o cadastro de tópicos no banco de dados, com informações como título, mensagem, autor, curso relacionado e data de criação.
- **Listar tópicos:**
  - Exibir todos os tópicos cadastrados, com suporte à paginação e ordenação.
  - Disponibilizar uma rota específica para listar apenas 10 tópicos por vez.
- **Consultar tópicos por ID:** Buscar os detalhes de um tópico específico com base em seu ID.
- **Atualizar tópicos:** Permitir a atualização de informações dos tópicos cadastrados, como título, mensagem, curso e estado do tópico.
- **Excluir tópicos:** Altera o campo booleano ativo para false, implementando um soft delete que mantém os dados no banco sem excluí-los fisicamente.
- **Paginação e Ordenação:** Suporte à paginação e ordenação para facilitar a manipulação de grandes conjuntos de dados.

<br>

## Estrutura do Projeto

<br>

## Como Utilizar a Aplicação

Para poder utilizar a aplicação, deve-se seguir os seguintes passos:
- Utilize alguma IDE, como Eclipse ou IntelliJ IDEA.
- Certifique-se de ter o plugin do Lombok instalado e configurado corretamente no ambiente de desenvolvimento.
- Garanta que o Java Development Kit (JDK) esteja instalado na versão 17 ou superior.
- Certifique-se de ter o Maven configurado para gerenciar as dependências do projeto. Sempre que adicionar ou atualizar alguma dependência, atualize o Maven do projeto para garantir que todas as dependências sejam baixadas corretamente.
- Utilize algum banco de dados como MySQL ou PostgreSQL e configure o banco de dados de acordo com as configurações definidas no arquivo <i>application.properties</i>. Você pode usar tanto variáveis de ambiente como valores diretamente no arquivo para definir a URL, o usuário, a senha e outras configurações necessárias para a conexão com o banco de dados.

> **Nota:** Como esta aplicação é apenas um back-end com comunicação via JSON, você precisará de um cliente HTTP para realizar as requisições, como Postman ou Insomnia.




