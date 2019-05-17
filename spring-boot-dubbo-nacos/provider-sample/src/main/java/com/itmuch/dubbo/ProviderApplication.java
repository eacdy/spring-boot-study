package com.itmuch.dubbo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
public class ProviderApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder(ProviderApplication.class)
        .run(args);
  }
}
