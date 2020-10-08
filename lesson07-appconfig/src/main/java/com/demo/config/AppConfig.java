package com.demo.config;

import com.demo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
   public User getUser(){
       return new User();
   }
}
