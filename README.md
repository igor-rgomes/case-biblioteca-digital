# 📚 Biblioteca Digital

Sistema de gerenciamento de livros com operações CRUD (Create, Read, Update, Delete), desenvolvido como estudo de caso acadêmico utilizando **Spring Boot** no back-end e **HTML + JavaScript + Bootstrap** no front-end.

---

## 🧑‍💻 Autor
- Igor Gomes
- 📘 Projeto acadêmico – UNIFECAF
- 🎓 Curso: Análise e Desenvolvimento de Sistemas
- 📅 Ano: 2025

## 🚀 Funcionalidades

- ✅ Cadastrar livros
- ✅ Listar livros cadastrados
- ✅ Excluir livros por ID
- ✅ Interface moderna com Bootstrap
- ⚙️ Integração com banco H2 em memória

---

## 🧱 Tecnologias Utilizadas

### Back-end:
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database

### Front-end:
- HTML5
- JavaScript (Fetch API)
- Bootstrap 5

---

## 🗂 Estrutura do Projeto
- case-biblioteca-digital/
- ├── BibliotecaDigital/ ← Projeto Java (Spring Boot)
- ├── BibliotecaFront/ ← index.html (interface web)

---

## ⚙️ Como Executar Localmente

### 📦 Pré-requisitos:
- Java 17+
- Maven

### ▶️ Rodar o Back-end (API REST)

Abra o terminal e execute:

```bash
cd BibliotecaDigital
mvn spring-boot:run
```

A API será iniciada em:
```bash
(http://localhost:8080/livros
```

## 🌐 Rodar o Front-end
01. Acesse a pasta BibliotecaFront
02. Dê dois cliques no arquivo index.html
03. O sistema abrirá no navegador e consumirá a API automaticamente

## 🔁 Endpoints da API
| MÉTODO   | ENDPOINT     | DESCRIÇÃO             |
|----------|--------------|-----------------------|
| GET      | /livros      | Lista todos os livros |
| POST     | /livros      | Cadastra novo livro   |
| DELETE   | /livros{id}  | Remove livro por ID   |

