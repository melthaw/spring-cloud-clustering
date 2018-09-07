package in.clouthink.springcloudclustering.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class HelloWorldRestController {

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello world";
    }

}
