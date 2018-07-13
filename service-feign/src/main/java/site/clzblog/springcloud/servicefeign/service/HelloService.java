package site.clzblog.springcloud.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import site.clzblog.springcloud.servicefeign.service.impl.HelloServiceImpl;

@FeignClient(value = "service-hello", fallback = HelloServiceImpl.class)
public interface HelloService {

    @GetMapping("hi")
    String hello(@RequestParam("name") String name);

}
