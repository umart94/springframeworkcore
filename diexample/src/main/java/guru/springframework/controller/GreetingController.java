package guru.springframework.controller;


import guru.springframework.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    //crreate this class and annotate it as a controller
    //it will be wired up as a spring bean

    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }


    public String sayHello(){
            String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        return greeting;
    }

}


