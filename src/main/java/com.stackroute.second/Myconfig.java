package com.stackroute.second;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.stackroute.second"})
public class Myconfig {
    @Bean
    public InternalResourceViewResolver method() {
        InternalResourceViewResolver irv = new InternalResourceViewResolver();
        irv.setPrefix("/WEB-INF/");
        irv.setSuffix(".jsp");
        return irv;
    }
}