package site.clzblog.springcloud.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hello")
public interface HelloService {

    @GetMapping("hi")
    String hello(@RequestParam("name") String name);

}
