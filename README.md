## Servlet examples

Презентации:
https://docs.google.com/presentation/d/1LJyzAWU312WOIHk6Dqy1QgR2EhDL9WaDe3nVT8BzAFo/edit?usp=sharing
https://docs.google.com/presentation/d/10fHBgwZN6Swib5iNB-ZvhJEjysSdIBrGpDLF5_NUiFY/edit?usp=sharing

### servers

Пример создания простого сервера на jetty и netty.
Каждый класс - отдельный пример.



Для сборки следующих приложений нужно выgолнить ```mvn clean package``` в соответствующей папке.

### servlet

Пример простого сервлета
Запускать ```java -jar target/servlet.jar```

```
http://localhost:8080/hello
```

### jsp

Пример использования jsp.
Запускать ```java -jar target/jsp.jar```

```
http://localhost:8080/
http://localhost:8080/jjj
http://localhost:8080/example.jsp
```

### spring-mvc

Пример использования spring-mvc
Запускать ```java -jar target/spring.jar```

```
http://localhost:8080/
http://localhost:8080/calc/{value}
```

### spring-freemarker

Запускать ```java -jar target/spring-freemarker.jar```

```
http://localhost:8080/
http://localhost:8080/test/1
http://localhost:8080/test/2
```

### jersey

Jersey.
Запускать ```java -jar target/jersey.jar```

```
http://localhost:8080/status
http://localhost:8080/data?service={service}
http://localhost:8080/data/param/{test}
http://localhost:8080/error
```

### jersey-mustache

Jersey с шаблонизатором mustache.
Запускать ```java -jar target/jersey-mustache.jar```

```
http://localhost:8080/
```
