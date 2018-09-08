package in.clouthink.springcloudclustering.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "application/json")
public class HelloWorldRestController {

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello world";
    }

}
