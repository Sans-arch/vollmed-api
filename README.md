# Vollmed API

REST API feita com Spring Boot utilizando dos conceitos de:
- Criação de controllers com Spring Web (Spring MVC, etc...)
- Migrations com Flyway
- JPA com Hibernate
- Validação usando a Spring Starter Validation (implementa a especificação do Java, Bean Validation)
- Criação de DTOs para receber dados de uma requisição e para gerar responses (serializações JSON)
- Paginação e ordenação
- Deleção de registro e Deleção lógica
- Segurança com Spring Security
- Hash de senhas usando BCrypt
- Uso de tokens JWT
- Documentação de API com uso de SpringDoc OpenAPI
- Testes automatizados usando Spring Starter Test (JUnit, Mockito, ...)


## Comandos

Para rodar a aplicação via linha de comando, por exemplo num servidor:
```sh
java "-Dspring.profiles.active=prod" "-DDATASOURCE_URL=jdbc:mysql://localhost/vollmed_api" "-DDATASOURCE_USERNAME=root" "-DDATASOURCE_PASSWORD=root" "-Dspring.output.ansi.enabled=ALWAYS" -jar .\target\api-0.0.1-SNAPSHOT.jar
```