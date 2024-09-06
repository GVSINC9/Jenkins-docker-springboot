package com.gvs.DockerDemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gvs.DockerDemo.properties.PropertiesConfig;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/docker")
public class DockerDemoController {

    @GetMapping("testAPI")
    public String testMethodAPI() {
        System.out.println(" *************************API Test Started************************************  ");
        return " ******  working fine   in testMethodAPI *****";
    }

	@Autowired
	PropertiesConfig config;

    @GetMapping("/data")
    public ResponseEntity<ResponseData> getData() {
        ResponseData responseData = new ResponseData();
        responseData.setId(1);
        responseData.setName(config.getName());
        responseData.setPlace("Hyderabad");
        responseData.setValue(config.getTest());
        System.out.println(" *************************ResponseEntity Method************************************  ");
        return new ResponseEntity<>(responseData, HttpStatus.OK);
        
    }

    @Getter
    @Setter
    public class ResponseData {
        private String name;
        private Integer id;
        private String place;
        private String value;
    }



}
