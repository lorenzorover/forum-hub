# Forum Hub

### Desafio 04 - Curso One-Alura
Programa desenvolvido durante o curso One da plataforma Alura, utilizando framework Spring do Java e banco de dados, alem de conter sistema de segurança por token.<br>

<br>

___

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

___

## Como Utilizar a Aplicação

Para poder utilizar a aplicação, deve-se seguir os seguintes passos:
- Utilize alguma IDE, como Eclipse ou IntelliJ IDEA.
- Certifique-se de ter o plugin do Lombok instalado e configurado corretamente no ambiente de desenvolvimento.
- Garanta que o Java Development Kit (JDK) esteja instalado na versão 17 ou superior.
- Certifique-se de ter o Maven configurado para gerenciar as dependências do projeto. Sempre que adicionar ou atualizar alguma dependência, atualize o Maven do projeto para garantir que todas as dependências sejam baixadas corretamente.
- Utilize algum banco de dados como MySQL ou PostgreSQL e configure o banco de dados de acordo com as configurações definidas no arquivo <i>application.properties</i>. Você pode usar tanto variáveis de ambiente como valores diretamente no arquivo para definir a URL, o usuário, a senha e outras configurações necessárias para a conexão com o banco de dados.

**Nota:** Como esta aplicação é apenas um back-end com comunicação via JSON, você precisará de um cliente HTTP para realizar as requisições, como Postman ou Insomnia.

<br>

___

## Estrutura do Projeto

<div> 
  <table>
    <tr>
      <th>Classe/Componente</th>
      <th width="450px">Funcionalidade(s)</th> 
    </tr> 
    <tr> 
      <th>domain</th> 
      <td>Contém as entidades do sistema, como "Topico" e "Usuario", que representam os dados e os comportamentos principais da aplicação. Também inclui enums e classes relacionadas ao domínio, como o "EstadoTopico" e o "Curso". Além disso, contém os DTOs (Data Transfer Objects), que são usados para transferir dados entre as camadas da aplicação, como "DadosCadastroTopico" e "DadosListagemTopico".</td> 
    </tr> 
    <tr> 
      <th>infrastructure</th> 
      <td>Inclui classes de infraestrutura, como a configuração de segurança, gerenciando autenticação e autorização. Contém também o "TokenService" para manipulação de tokens e outras classes auxiliares de segurança e exceções.</td> 
    </tr> 
    <tr> 
      <th>controller</th> 
      <td>Contém os controladores responsáveis por expor os endpoints REST para o gerenciamento de "Topico" e "Usuario", além de manipular as requisições HTTP relacionadas, como criação, atualização, listagem e exclusão de tópicos e usuários.</td> 
    </tr> 
  </table> 
</div>

<br>

___

## 📚 Tecnologias utilizadas

<div>
  <table>
    <tr>
      <th>
        Linguagem
      </th>
      <td>
        <img alt="Static Badge" src="https://img.shields.io/badge/java-yellow?style=for-the-badge">
        <img alt="Static Badge" src="https://img.shields.io/badge/sql%20-%20cyan?style=for-the-badge">
      </td>
    </tr>
    <tr>
      <th>
        Banco de Dados
      </th>
      <td>
        <img alt="Static Badge" src="https://img.shields.io/badge/mysql%20-%20blue?style=for-the-badge">
      </td>
    <tr>
      <th>
         Biblioteca
      </th>
       <td width="420px">
         <img alt="Static Badge" src="https://img.shields.io/badge/lombok%20-%20black?style=for-the-badge">
         <img alt="Static Badge" src="https://img.shields.io/badge/spring%20web%20-%20black?style=for-the-badge">
         <img alt="Static Badge" src="https://img.shields.io/badge/spring%20boot%20devtools%20-%20black?style=for-the-badge">
         <img alt="Static Badge" src="https://img.shields.io/badge/spring%20data%20jpa%20-%20black?style=for-the-badge">
         <img alt="Static Badge" src="https://img.shields.io/badge/flyway%20migration%20-%20black?style=for-the-badge">
         <img alt="Static Badge" src="https://img.shields.io/badge/mysql%20driver%20-%20black?style=for-the-badge">
         <img alt="Static Badge" src="https://img.shields.io/badge/validation%20-%20black?style=for-the-badge">
         <img alt="Static Badge" src="https://img.shields.io/badge/spring%20security%20-%20black?style=for-the-badge">
      </td>
    </tr>
    <tr>
      <th>
        IDE
      </th>
      <td>
        <img alt="Static Badge" src="https://img.shields.io/badge/intelij-black?style=for-the-badge">
      </td>
    </tr>
    <tr>
      <th>
        Framework
      </th>
      <td>
        <img alt="Static Badge" src="https://img.shields.io/badge/spring%20boot%20-%20green?style=for-the-badge">
      </td>
    </tr>
  </table>
</div>

<br>

___

<br>

## Autor
| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/168394448?v=4" width=115><br><sub>Lorenzo Rover</sub>](https://github.com/lorenzorover) |
| :---: |
<br>
Desenvolvido em janeiro de 2025.



