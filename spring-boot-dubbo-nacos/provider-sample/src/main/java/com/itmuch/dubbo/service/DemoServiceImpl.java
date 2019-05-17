package com.itmuch.dubbo.service;

import com.itmuch.dubbo.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

  @Value("${dubbo.application.name}")
  private String serviceName;

  @Override
  public String sayHello(String name) {
    return String.format("[%s] : Hello, %s", serviceName, name);
  }
}