# Spring Framework Overview  

Project for better understanding how Spring works by going through minimal examples.  

### Observations

- Eclipse doesn't support Kotlin gradle build scripts, yet.
- SpringFramework libraries are compatible with Java SE 8 _as recent as_ version 5.3.X. Version 6 of Spring Framework is only compatible with Java 17+.
- `org.springframework:spring-context` gives you AOP and annotations. Not sure how to use Spring FW with core alone.
- [docs](https://docs.spring.io/spring-framework/docs/5.3.24/reference/html/)
- Setters and a no-args constructor are required for field-based DI. In XML based configuration, use `<property name="" ref=""/>` for each setter-injected dependency.
- Beans created by factory methods are **not** lazily instantiated by Spring (by default).
- In section 1.4.1 of the docs, "Beans that are singleton scoped and set to be pre-instantiated (**the default**) are created **when the container is created**.  
- To set lazy-initialized beans in XML config, set `<beans default-lazy-init="true">` for all beans, or `<bean lazy-init="true"/>` for a single bean.
- Autowiring can be implemented in XML per bean by passing an `autowire` argument, e.g. `<bean autowire="constructor"/>`. This means Spring will inject constructor dependencies with the bean sharing its type (there's expected to be only one bean of that type, otherwise an exception is thrown).
