package app.config;

import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {


    @Bean(name="dog")
    public Dog getSobak() {
        Dog dog = new Dog();
        dog.setSob("dog");
        return dog;
    }
    @Bean(name = "timer")
    public Timer getMi() {
        Timer timer = new Timer();
        return timer;


    }
}

