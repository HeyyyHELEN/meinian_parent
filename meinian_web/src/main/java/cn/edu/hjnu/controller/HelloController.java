package cn.edu.hjnu.controller;


import cn.edu.hjnu.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello(String name){
        /*System.out.println("hello");*/
        return helloService.sayHello(name);
    }

}
