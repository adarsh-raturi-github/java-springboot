package springmaven1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import springmaven1.Alien;
import springmaven1.Desktop;

@Configuration
public class AppConfig{
  

    @Bean
    public Alien alien()
    {
        return new Alien()
    }
    @Bean(name={"beast","beast1"})
    @Scope("prototype")
    public Desktop desktop1()
    {
     return new Desktop();
    }
}