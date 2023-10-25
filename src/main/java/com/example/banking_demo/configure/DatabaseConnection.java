package com.example.banking_demo.configure;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

//@Profile({"local"})
/*
-Dspring.profiles.active=local
 */
@Configuration
public class DatabaseConnection
{
    @Value("${appName}")
    private String appName;

    public DatabaseConnection(){
        System.out.println("appName -> " + appName);
    }

}
