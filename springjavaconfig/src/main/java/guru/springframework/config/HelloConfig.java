package guru.springframework.config;

import guru.springframework.service.HelloWorldFactory;
import guru.springframework.service.HelloWorldService;
import guru.springframework.service.HelloWorldServiceEnglishImpl;
import guru.springframework.service.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    //uses helloworldfactory in service package to create a service object

    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }





    @Bean
    @Profile("english")
    @Primary
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory){
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    @Primary
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory){
        return factory.createHelloWorldService("es");
    }


    @Bean(name = "french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory){
        return factory.createHelloWorldService("fr");
    }

    @Bean
    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory){
        return factory.createHelloWorldService("de");
    }

    @Bean
    public HelloWorldService helloWorldServicePolish(HelloWorldFactory factory){
        return factory.createHelloWorldService("pl");
    }

    @Bean
    public HelloWorldService helloWorldServiceRussian(HelloWorldFactory factory){
        return factory.createHelloWorldService("ru");
    }










    /*
    Parameter 0 of method setHelloWorldService in guru.springframework.controller.GreetingController required a single bean, but 2 were found:
	- helloWorldServiceEnglish: defined by method 'helloWorldServiceEnglish' in class path resource [guru/springframework/config/HelloConfig.class]
	- helloWorldServiceSpanish: defined by method 'helloWorldServiceSpanish' in class path resource [guru/springframework/config/HelloConfig.class]


    solution : annotate them with profile.
     */





}
