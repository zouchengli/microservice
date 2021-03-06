package site.clzblog.springcloud.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.clzblog.springcloud.serviceribbon.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "hello")
    public String hello(@RequestParam String name) {
        return helloService.hello(name);
    }

}
