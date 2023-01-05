package link.hiroshisprojects.springbasics.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan("link.hiroshisprojects.springbasics.propertysources")
public class MyBeans {
    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setLocations(new ClassPathResource("configuration/example.properties"));
        return propertySourcesPlaceholderConfigurer;
    }

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
