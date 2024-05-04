package springboot.webservices.restfulwebservices.HelloWorldController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/helloworld-bean")
    public helloWorldBean helloworldbean() {

        return new helloWorldBean("helloworld");
    }

    
    @GetMapping(path = "/helloworld/path-variable/{name}")
    public helloWorldBean helloWorld(@PathVariable String name) {
        
        return new helloWorldBean(String.format("Hello World, %s", name));
    }
}
