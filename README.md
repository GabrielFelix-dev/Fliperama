# 📘 Fliperama - Aplicação Web com Spring Boot

## 🔎 Introdução

Este projeto é uma aplicação web desenvolvida em **Spring Boot**, que
simula um sistema de **Fliperama Virtual**.\
Ele permite gerenciar **usuários**, **jogos**, **pontuações** e
**configurações** de forma organizada, seguindo a arquitetura em
camadas.

A aplicação utiliza **Spring Data JPA** para persistência de dados e
segue boas práticas de desenvolvimento REST.

------------------------------------------------------------------------

## 📂 Estrutura do Código (`src`)

O projeto segue uma arquitetura em camadas, organizada da seguinte
forma:

### 🔹 Entidades (`entities`)

As entidades representam as tabelas do banco de dados:

-   **`UserEntity`**\
    Representa os usuários cadastrados no sistema (jogadores).\
    Possui relacionamento com `ScoreEntity`.

-   **`GameEntity`**\
    Representa os jogos disponíveis no fliperama.\
    Relaciona-se com `ScoreEntity`.

-   **`ScoreEntity`**\
    Registra as pontuações dos usuários em cada jogo.\
    Relacionamentos:

    -   Muitos-para-um com `UserEntity` (um usuário pode ter várias
        pontuações).\
    -   Muitos-para-um com `GameEntity` (um jogo pode ter várias
        pontuações).

-   **`ConfigEntity`**\
    Armazena configurações gerais do sistema (por exemplo, parâmetros do
    fliperama).

------------------------------------------------------------------------

### 🔹 Repositórios (`repositories`)

Interfaces responsáveis pela persistência, estendendo `JpaRepository`.\
Cada entidade possui seu repositório correspondente:\
- `UserRepository`\
- `GameRepository`\
- `ScoreRepository`\
- `ConfigRepository`

------------------------------------------------------------------------

### 🔹 Serviços (`services`)

Camada de **regras de negócio**. Cada serviço faz a ponte entre os
controladores e os repositórios:\
- `UserService` → lógica de usuários\
- `GameService` → lógica de jogos\
- `ScoreService` → lógica de pontuações\
- `ConfigService` → lógica de configurações

------------------------------------------------------------------------

### 🔹 Controladores (`controllers`)

Camada responsável por expor os **endpoints REST** da aplicação:\
- `UserController` → operações relacionadas a usuários\
- `GameController` → operações relacionadas a jogos\
- `ScoreController` → operações relacionadas a pontuações\
- `ConfigController` → operações relacionadas a configurações

Cada controlador utiliza o respectivo service para processar as
requisições.

------------------------------------------------------------------------

## ⚙️ Dependências (do `pom.xml`)

As principais dependências do projeto são:

-   **Spring Boot Starter Web** → criação da API REST\
-   **Spring Boot Starter Data JPA** → persistência com JPA/Hibernate\
-   **Spring Boot DevTools** → live reload durante o desenvolvimento\
-   **MySQL Connector/J** → driver de conexão com o banco MySQL\
-   **Spring Boot Starter Test** → testes automatizados\
-   **Jackson (Core, Databind, Annotations)** → serialização e
    desserialização JSON

------------------------------------------------------------------------

## 🗄️ Banco de Dados

O projeto está configurado para utilizar **MySQL** como **SGBD**.\
As credenciais e configurações devem ser ajustadas no arquivo
`application.properties`, por exemplo:

``` properties
spring.datasource.url=jdbc:mysql://localhost:3306/fliperama
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
```

------------------------------------------------------------------------

## ▶️ Como Rodar

1.  Clonar o repositório

    ``` bash
    git clone <url-do-repositorio>
    cd fliperama
    ```

2.  Configurar o banco MySQL e atualizar `application.properties`.

3.  Executar a aplicação Spring Boot:

    ``` bash
    ./mvnw spring-boot:run
    ```

4.  Acessar a API em:

        http://localhost:8080
