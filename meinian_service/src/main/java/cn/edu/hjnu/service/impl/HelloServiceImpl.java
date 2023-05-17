package cn.edu.hjnu.service.impl;

import cn.edu.hjnu.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello," + name;
    }
}
