# spring-guru

Spring boot web application demo

## How to Run

./gradlew bootRun -Dspring.profiles.active=local

## Links

- http://localhost:8080/joke Including third party library as a @Bean
- http://localhost:8080/recipe An example of how to use H2 and MySQL

## APIs

**Get User**

> % curl -H "Accept: application/json" http://localhost:8080/user/1
>
> {"id":1,"name":"Mick"}

**Throwing an Exception**

> % curl -H "Accept: application/json" http://localhost:8080/user/3
>
> {"timestamp":"2018-07-12T10:19:09.653+0000","status":404,"error":"Not Found","message":"could not find user '3'.","path":"/user/3"}