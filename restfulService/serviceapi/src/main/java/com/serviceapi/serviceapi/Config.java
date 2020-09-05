package com.serviceapi.serviceapi;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.serviceapi.serviceapi.dao")
@Configuration
public class Config {


}