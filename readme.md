# Sistema de Microserviços com Spring Boot

Este repositório contém um sistema de microserviços desenvolvido em Java com Spring Boot. O projeto inclui submódulos para os serviços de pagamento e pedidos, além de um gateway e service discovery configurados diretamente no repositório principal. Este projeto foi desenvolvido com base em um curso da Alura.

## Arquitetura do Projeto

### Submódulos

- **Serviço de Pagamentos**: Implementado em Java com Spring Boot. Responsável pelo processamento de pagamentos.
- **Serviço de Pedidos**: Implementado em Java com Spring Boot. Responsável pela gestão de pedidos dos clientes.

### Pastas no Repositório Principal

- **Gateway**: Utilizado para controlar o acesso aos microserviços. O gateway é responsável por expor as rotas corretas para os serviços internos.
- **Service Discovery**: Implementado com Spring Cloud Netflix Eureka, possibilita a descoberta automática de microserviços na rede.

## Como Executar

Todos os serviços podem ser executados localmente utilizando o wrapper do Maven. Para iniciar qualquer serviço, basta navegar até a pasta desejada e executar o seguinte comando:

```bash
./mvnw spring-boot:run
```

Para garantir que os microserviços estão rodando corretamente, inicie primeiro o **Service Discovery**, seguido pelos demais serviços (Pagamentos, Pedidos e Gateway).

## Estrutura do Repositório

```
.
├── gateway/                   # Pasta do gateway
├── service-discovery/          # Pasta do service discovery
├── pagamentos/                 # Submódulo para o serviço de pagamentos
├── pedidos/                    # Submódulo para o serviço de pedidos
└── README.md                   # Este arquivo
```

## Suporte a Docker (Em Construção)

Desenvolvendo a infraestrutura para que todos os microserviços sejam executados dentro de containers Docker. A ideia é que todos os serviços se comuniquem dentro de uma rede Docker privada, deixando exposta apenas a porta do gateway.

Em breve, o suporte ao Docker será concluído, facilitando a execução e escalabilidade dos microserviços.
![Diagrama](https://github.com/thativam/microserviceStudy/blob/main/diagrama.png)
## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Cloud Netflix Eureka** (para service discovery)
- **Spring Gateway**
    - **Load Balancing** Em Desenvolvimento 
- **Maven**
- **Docker** (suporte em construção)

## Base do Projeto

Este projeto foi criado com base no curso de microserviços da **Alura**, onde aprendemos a construir uma arquitetura robusta e escalável utilizando Spring Boot e Docker.

---
