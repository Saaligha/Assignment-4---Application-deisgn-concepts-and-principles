package Assignment4;

import org.springframework.context.annotation.Bean;

public class App {


    @Bean(name="Baby")
    public Baby Baby(){
        return new Baby();
    }

    @Bean(name="Toddler")
    public Toddler Toddler(){
        return new Toddler();
    }

    @Bean(name="Kids")
    public Kids Kids(){
        return new Kids();
    }

    @Bean(name="Runner")
    public Runner Runner(){
        return new Runner();
    }



}
