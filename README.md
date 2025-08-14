# Projeto Crud de Usuários - Java Spring Boot + Postgresql + Docker

## 📍 Descrição do Projeto
Este projeto visa, testar os conhecimentos práticos de desenvolvimento de uma api em backend usando repositório em postgresql e docker.

---

## 🚀 Tecnologias utilizadas
- **Java 17**
- **Spring Boot**
    - **Spring Web**
    - **Spring Data JPA**
    - **Spring Validation**
- **PostgresSQL 15**
- **Docker & Docker Compose**
- **Maven**
- **Lombok** (para reduzir código boilerpate)
- **Swagger** (documentaç!ao interativa da API)

---

## Estrutura do Projeto

|--src
|--|--main
|--|--|--java/com/exemplo/crudusuarios
|--(...)
|--Readme.md

---

## Funcionalidades
- Criar usuário
- Listar todos os usuários
- Buscar usuario por ID
- Atualizar usuário
- Deletar usuário
- Documentaç!ao Swagger disponivel em '/swagger-ui.html'

---

## Pré-requisitos
Antes de iniciar, você precisa ter instalados
- [Docker] (https://...) (>=20)
- [Docker Compose]
- Git

---

## Passos para instalação e Execução

### Clonar o Repositório

```bash
git clone https://github.com/seuusuario/crud-usuarios-spring-docker.git

cd crud-usuarios-spring-docker

```

### Construir os cointainer

```bash
docker-compose up --bluid
```

