package site.clzblog.springcloud.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.clzblog.springcloud.servicefeign.service.HelloService;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("hello")
    public String hello(@RequestParam("name") String name) {
        return helloService.hello(name);
    }

}
