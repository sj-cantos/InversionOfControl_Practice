package com.shannon.firstproject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "person")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    public String name;
    public int age;
    public String address;
}
