package link.hiroshisprojects.springbasics.configuration;

import org.springframework.beans.factory.annotation.Value;

public class BeanA {
    @Value("${my.property}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
