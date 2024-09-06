package com.gvs.DockerDemo.properties;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created By veera,  on 17/aug/2024
 **/
@Configuration
@ConfigurationProperties(prefix = "app.data")
@Getter
@Setter
public class PropertiesConfig {

	private String test;
	private String name;
}