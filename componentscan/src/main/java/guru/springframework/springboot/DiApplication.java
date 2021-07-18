package guru.springframework.springboot;

import guru.springframework.controller.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("guru.springframework")
public class DiApplication {

    public static void main(String[] args) {
        /*
        spring profiles are used when we can use an active profile
        that determines which beans will get wired up in our project
         */

        ApplicationContext context = SpringApplication.run(DiApplication.class, args);
        GreetingController controller = (GreetingController) context.getBean("greetingController");
        controller.sayHello();
    }

}
