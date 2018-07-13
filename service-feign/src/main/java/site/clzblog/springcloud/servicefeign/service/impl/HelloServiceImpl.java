package site.clzblog.springcloud.servicefeign.service.impl;

import org.springframework.stereotype.Service;
import site.clzblog.springcloud.servicefeign.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Sorry " + name;
    }
}
