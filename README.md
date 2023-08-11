# products-back-java
Aplicação back-end para uma aplicação que utiliza produtos, utilizando **Java** e **SpringBoot**. Nesta aplicação, são gerenciadas as informações de produtos, permitindo a criação, leitura, atualização e exclusão dos registros.

## Projeto

Para esse projeto, foi decidido implementar um modelos de banco de dados relacional, utilizando o **Postgres**.

## Dados

Cada produto possui os seguintes campos: **name** e **value**.             

## Endpoints

Essa aplicação expões uma API RESTful, com os seguintes end-points:

Endpoint                    | Método    | Descrição
--------------------------- | --------  |-------------------
products                    | GET       | Retorna um array com todos os produtos
products/(:num)             | GET       | Retorna um produto cujo id é (:num)
products                    | POST      | Cria um novo produto
products/(:num)             | PUT       | Atualiza produto cujo id é (:num)
products/(:num)             | DELETE    | Deleta produto cujo id é (:num)

## Banco de Dados

Para rodar esta aplicação, você precisará de um servidor de banco de dados instalado e rodando em sua máquina, utilizando o **Postgres**. Com a ferramenta de sua preferência, crie um banco de dados novo para esta aplicação. As configurações do banco de dados para esta aplicação são encontradas no arquivo **application.properties**, na pasta **src/main/resources** do repositório. Neste arquivo você poderá modificar o nome, usuário e senha para as informações do banco de dados que você criou.

## Instalação

1. Instale um servidor de banco de dados **Postgres** em sua máquina, inicie ele e crie um novo banco de dados.

2. Clone este repositório e, na pasta raiz, execute o seguinte comando para instalar as dependências necessárias do projeto:

    ```
    > mvn clean install
    ```

3. Modifique o **application.properties** com as configurações do banco de dados que você criou, como mostrado em [Banco de Dados](#banco-de-dados).

8. Após instalado e configurado, basta você dar o seguinte comando para subir o servidor:

    ```
    > mvn spring-boot:run 
    ```

## Melhorias

O sistema está realizando todas as operações propostas, porém existem algumas melhorias a serem implementadas.

* Adicionar autenticação
    * Atualmente qualquer usuário pode efetuar as chamadas na API, sem qualquer autenticação.
* Melhorar error handling quando o body da chamada não possui os campos esperados.
* Tirar as informações sensíveis do arquivo **application.properties** do repositório público.
