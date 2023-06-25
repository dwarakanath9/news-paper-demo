package com.news.controller;

import com.news.model.Newspaper;
import com.news.service.NewspaperService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewspaperController {

    private NewspaperService newspaperService;

    public NewspaperController(NewspaperService service){
        this.newspaperService = service;
    }

    @GetMapping("/all")
    public List<Newspaper> getAllNewspapersFromWeb() {
        return newspaperService.getAllNewspapersFromWeb();
    }

    @GetMapping("/hello")
    public String sayHelloToMe() {
        return "Hello from kubernates cluster";
    }

    @GetMapping()
    public String sayhello() {
        return "Hello from kubernates cluster 1.0";
    }

}

