# Tele 2 task

# Использованные технологии

* [Java 21](https://docs.oracle.com/javase/specs/jls/se21/html/index.html) – как основной язык программирования.
* [Spring Boot 3.2](https://spring.io/projects/spring-boot) – как основной фреймворк.
* [Gradle 8.6](https://gradle.org/) – как система сборки приложения.
* [Spring MVC](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html) – как основной WEB-API. Spring MVC был выбран в качестве основного WEB-API в рамках данной задачи, поскольку в API отсутствуют обращения к базе данных или другим внешним сервисам, а также не предполагается высокая нагрузка на приложение, соответственно основной поток не блокируется в ожидании ответа, что снимает необходимость в реактивном API.

# Код

RESTful приложение, которое предоставляет текущее время сервера с точностью до секунд, с указанием таймзоны в формате: {"timezone":"timezone", "time": "time"}

# Тесты

Написаны только для единственного REST endpoint'а
* JUnit5
