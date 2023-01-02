# Spring Framework Overview  

Project for better understanding how Spring works by going through minimal examples.  

### Observations

- Eclipse doesn't support Kotlin gradle build scripts, yet.
- SpringFramework libraries are compatible with Java SE 8 _as recent as_ version 5.3.X. Version 6 of Spring Framework is only compatible with Java 17+.
- `org.springframework:spring-context` gives you AOP and annotations. Not sure how to use Spring FW with core alone.
- [docs](https://docs.spring.io/spring-framework/docs/5.3.24/reference/html/)
- For pure XML-based configuration, if you have a field dependency for Spring to inject, you have to define a getter and a setter for that field (e.g. in CatService, define getter and setter for CatDao field/dependency).  
- Beans created by factory methods are **not** lazily instantiated by Spring (by default).
