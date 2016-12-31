## Servlet examples

To build each application run ```mvn clean package``` in corresponding folder.

Keep in mind that configuration with xml has been made only for educational purposes, consider using code based configuration for production code.
Pay attention to web.xml path - because of jsp precompilation this file is located in target directory.
A lot of improvements could be made for packaging, like embedding all files in jar, not just code and compiled jsps.

### servlet

Simple servlet application.
Run this application with ```java -jar target/servlet.jar```

Available urls:
```
http://localhost:8080/hello/tt
```

### jsp

Add jsp support.
Run this application with ```java -jar target/jsp.jar```

Available urls:
```
http://localhost:8080/
http://localhost:8080/jjj
http://localhost:8080/example.jsp
```

### spring-mvc

Spring MVC example.
Run this application with ```java -jar target/spring.jar```

Available urls:
```
http://localhost:8080/
http://localhost:8080/calc/{value}
```

### spring-freemarker

Spring MVC example with freemarker and java configuration.
Run this application with ```java -jar target/spring-freemarker.jar```

Available urls:
```
http://localhost:8080/
```

### jersey

Jersey example.
Run this application with ```java -jar target/jersey.jar```

Available urls:
```
http://localhost:8080/status
http://localhost:8080/data?service={service}
```

### jersey-mustache

Jersey with mustache example.
Run this application with ```java -jar target/jersey-mustache.jar```

Available urls:
```
http://localhost:8080/
```

### netty

Same as standard netty example.
Run this application with ```java -jar target/netty.jar```

Available urls:
```
http://localhost:8080
```

