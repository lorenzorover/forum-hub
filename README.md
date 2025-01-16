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

##
