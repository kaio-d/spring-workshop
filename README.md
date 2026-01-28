# 🛒 Sistema de Simulação de Compra (E-commerce)

## 📌 Sobre o Projeto
Este projeto consiste em um **sistema de simulação de compra**, desenvolvido com o objetivo de **praticar e consolidar conhecimentos na linguagem Java**, utilizando o **Spring Boot**.

A aplicação representa uma pequena parte de um **e-commerce**, permitindo a interação entre **Produtos**, **Usuários** e **Pedidos**, possibilitando a realização de operações de **CRUD (Create, Read, Update e Delete)** nesses recursos.

---

## 🚀 Tecnologias Utilizadas
O projeto foi desenvolvido utilizando as seguintes tecnologias e dependências:

- **Java**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database** (ambiente de testes)
- **PostgreSQL** (ambiente de desenvolvimento/produção)

---

## 🏗️ Arquitetura e Estrutura de Pacotes
Durante o desenvolvimento, foi aplicada uma arquitetura em camadas, buscando **organização**, **manutenibilidade** e **separação de responsabilidades**.

A estrutura de pacotes está organizada da seguinte forma:

- **entities**  
  Contém as classes de domínio e seus atributos, representando as entidades do sistema.

- **repositories**  
  Responsáveis pela comunicação com o banco de dados, utilizando os métodos padrão fornecidos pelo Spring Data JPA.

- **resources (controllers)**  
  Camada responsável por expor as entidades através de **requisições HTTP**, permitindo o acesso via API REST.

- **services**  
  Responsável por conter a **regra de negócio** da aplicação e realizar a comunicação entre controllers e repositories.

- **exceptions**  
  Contém a **tratativa personalizada de exceções**, garantindo respostas padronizadas e mais claras em caso de erro.

---

## 🎯 Objetivos do Projeto
- Praticar o desenvolvimento de **APIs REST com Spring Boot**
- Aplicar conceitos de **arquitetura em camadas**
- Trabalhar com **persistência de dados utilizando JPA**
- Utilizar **bancos de dados diferentes por ambiente**
- Implementar **boas práticas de organização e tratamento de exceções**

---

