# Task Manager API

API REST para gerenciamento de tarefas, desenvolvida com Java e Spring Boot.

Projeto desenvolvido como parte do desafio de Padrões de Projeto da DIO.

## Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA
- Maven
- Banco de dados H2

## Funcionalidades

- Criar tarefas
- Listar tarefas
- Buscar tarefa por ID
- Atualizar tarefas
- Excluir tarefas
- Ordenar tarefas por título ou data

## Padrões de Projeto

- **Singleton:** utilizado pelo escopo padrão dos componentes Spring.
- **Facade:** centraliza as operações na classe TaskFacade.
- **Strategy:** permite diferentes estratégias de ordenação das tarefas.

## Como executar

No terminal, execute:

```powershell
.\mvnw.cmd spring-boot:run
```

A API ficará disponível em:

http://localhost:8080/api/tasks

## Autor

Projeto desenvolvido para fins de aprendizado em Java e Spring Boot.