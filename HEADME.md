# Gateway API

A **Gateway API** serve como uma interface unificada para o acesso aos serviços de Lançamentos e Consolidação. O projeto gerencia o roteamento de requisições, aplica políticas de segurança e oferece uma documentação integrada para facilitar a integração de clientes e outros serviços.

## Descrição do Projeto

Este projeto foi criado com o objetivo de fornecer um gateway para centralizar o acesso aos serviços internos e externos, fornecendo segurança, roteamento, e balanceamento de carga de maneira eficaz.

## Estrutura do Projeto

### Pacote Principal

O pacote principal do projeto é:

com.hilquiascamelo.gateway_api


Esse nome foi ajustado para seguir as convenções de nomeação válidas do Java.

## Tecnologias e Dependências

- **Spring Cloud Gateway** - Para o roteamento e gerenciamento de tráfego.
- **Spring Security** - Para a aplicação de políticas de autenticação e autorização.
- **Spring Boot DevTools** - Para desenvolvimento ágil com auto-restart e live reload.
- **Lombok** - Para reduzir a verbosidade do código, com anotação de getters, setters e builders.
- **SpringDoc OpenAPI UI** - Para documentação automática da API no formato OpenAPI.
- **Jakarta API** - Para suporte a validação, servlet, XML e serviços RESTful.

### Arquivo `pom.xml`

O arquivo `pom.xml` contém as seguintes seções e configurações importantes:

- **Versão do Java**: 21
- **Versão do Spring Cloud**: 2023.0.3
- **Parent**: spring-boot-starter-parent na versão 3.3.5

#### Dependências do Projeto

Algumas dependências principais incluem:

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-gateway</artifactId>
</dependency>
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-ui</artifactId>
    <version>1.6.14</version>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
</dependency>
```

### Configurações e Uso
Requisitos
Java 21
Maven para o gerenciamento de dependências
Comandos Importantes
Para compilar e executar o projeto, use:

```bash
mvn clean install
mvn spring-boot:run
```
Para gerar uma imagem OCI:

```bash
mvn spring-boot:build-image
```
Documentação da API
A documentação da API está disponível na interface OpenAPI gerada pelo SpringDoc. Para acessar, vá para http://localhost:<porta>/swagger-ui.html após iniciar o serviço.

Desenvolvimento e Contribuição
Configuração do Ambiente
Certifique-se de ter o JDK 21 instalado e o Maven configurado para iniciar o desenvolvimento.

Executando Testes
Para executar testes unitários, utilize:


### mvn test
Links Úteis
Documentação do Maven
Guia de Referência do Spring Boot
Guia Spring Cloud Gateway



