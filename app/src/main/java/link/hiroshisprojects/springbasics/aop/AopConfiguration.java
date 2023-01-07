package link.hiroshisprojects.springbasics.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("link.hiroshisprojects.springbasics.aop")
class AopConfiguration {

}
