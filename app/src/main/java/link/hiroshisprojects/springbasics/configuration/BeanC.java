package link.hiroshisprojects.springbasics.configuration;


import org.springframework.stereotype.Component;

@Component
public class BeanC {
    private BeanA beanA;

    public BeanC(BeanA beanA) {
        this.beanA = beanA;
    }

    public void printMessage() {
        System.out.println("BeanC instantiated with property " + beanA.getName());
    }

}
