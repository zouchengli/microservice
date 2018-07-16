package site.clzblog.springcloud.servicezipkin;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class ServiceZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZipkinApplication.class, args);
    }

    private static final Logger LOG = Logger.getLogger(ServiceZipkinApplication.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String callHome(){
        LOG.log(Level.INFO, "calling trace service-zipkin  ");
        return restTemplate.getForObject("http://localhost:8989/home", String.class);
    }

    @RequestMapping("/info")
    public String info(){
        LOG.log(Level.INFO, "calling trace service-zipkin ");
        return "i'm service-zipkin";
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
