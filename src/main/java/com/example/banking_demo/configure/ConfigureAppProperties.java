package com.example.banking_demo.configure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "key")
@Configuration("appProperty")
public class ConfigureAppProperties
{
    private String secretKey;
    private String url;
}
