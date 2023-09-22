package com.esprit.candidatems;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatRestAPI {

    private String title="Hello, i'm the Candudate MS";

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("title");
        return  title;
    }

}
