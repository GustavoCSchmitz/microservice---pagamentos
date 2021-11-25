### microservice---pagamentos
Este projeto é um microservice desenvolvido com a tecnologia Spring Boot utilizando Maven e API Rest, onde o usuário consegue efetuar pagamentos através dessa API.

Obs: Este projeto só faz sentido executando juntamente com os outros 4 serviços
   - [Carteira](https://github.com/GustavoCSchmitz/microservice---carteira)
   - [Saque,depósito e transferência](https://github.com/GustavoCSchmitz/microservice---saqueDeposito)
   - [Eureka Server](https://github.com/GustavoCSchmitz/microservice---eureka)
   - [Usuários](https://github.com/GustavoCSchmitz/microservice---usuarios)

###Ordem de execução
1º [Eureka Server](https://github.com/GustavoCSchmitz/microservice---eureka)
2º [Pagamentos](https://github.com/GustavoCSchmitz/microservice---pagamentos)
3º [Carteira](https://github.com/GustavoCSchmitz/microservice---carteira)
4º [Saque,depósito e transferência](https://github.com/GustavoCSchmitz/microservice---saqueDeposito)
5º [Usuários](https://github.com/GustavoCSchmitz/microservice---usuarios)


### Requisitos de API e instruções para execução
 - Java 8
 - Maven 3 para construir o aplicativo.
 - Abrir no caminho `pastaRaizDoProjeto/Docker` e executar o comando:
      `docker-compose up`
 - Feito isso, o rabbitMQ deve ser ativado

 - Em seguida voltar na pasta raíz do projeto e executar o comando:
 
      `mvn clean install`
 - Após a instalação, subir o projeto com o comando:
       
      `mvn spring-boot:run`
      
### API endpoint
  - Método: PUT
     - Pagamento
        - [http://localhost:8082/pagamento]()
        - Deve ser inserido um json, semelhante ao exemplo abaixo:
        ```
        {
          "valor": 550.0,
          "id": 1,
          "carteira":{
              "titular": "Gustavo"
          }
        }
        ```
        - Todos os campos são obrigatórios

 
