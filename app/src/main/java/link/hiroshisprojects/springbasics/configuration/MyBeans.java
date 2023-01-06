package link.hiroshisprojects.springbasics.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan("link.hiroshisprojects.springbasics.propertysources")
@PropertySource("configuration/example.properties")
public class MyBeans {

    @Bean
    public BeanB beanB() {
        return new BeanB(beanA());
    }
    @Bean
    public BeanA beanA() {
        BeanA beanA = new BeanA();
        return beanA;
    }
}
