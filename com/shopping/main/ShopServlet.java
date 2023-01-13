package com.shopping.main;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.shopping.main.Controller,com.shopping.main.Service;"})
public class ShopServlet  implements WebMvcConfigurer{

}
