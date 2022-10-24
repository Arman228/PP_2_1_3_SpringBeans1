package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dog  extends Animal {

    private String sob;



    public String getSob() {
        return sob;
    }
//@Autowired
   @Qualifier("dog")
    public void setSob(String sob) {
        System.out.println("Set sobak");
    }
}
