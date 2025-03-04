package com.example.postgresSQL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class PostgresSqlApplication {
    public static final Logger log = LoggerFactory.getLogger(PostgresSqlApplication.class);

    public static void main(String[] args) {
//		ConfigurableApplicationContext con= SpringApplication.run(PostgresSqlApplication.class, args);
//		for (String beanDefinitionName : con.getBeanDefinitionNames()) {
//			System.out.println(beanDefinitionName);
//		}
//		Arrays.stream(con.getBeanDefinitionNames()).forEach(System.out::println);
        ConfigurableApplicationContext con = SpringApplication.run(PostgresSqlApplication.class, args);
//		Arrays.stream(con.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
