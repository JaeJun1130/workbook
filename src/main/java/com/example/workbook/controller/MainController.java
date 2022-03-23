package com.example.workbook.controller;

import com.example.workbook.dto.TestDto1;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

@RestController
@Controller
public class MainController {

    @GetMapping("/main")
    public ResponseEntity<?> mainGet(HttpServletRequest request) {
        System.out.println("MainController.mainGet");
        System.out.println("request.getParameter(\"name\") = " + request.getParameter("name"));
        
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create("/main/news"));
        return new ResponseEntity<>(null, headers, HttpStatus.TEMPORARY_REDIRECT);
    }
    
    @GetMapping("/main/news")
    public void news(HttpServletRequest request) {
        System.out.println("MainController.news");
        System.out.println("request.getParameter(\"name\") = " + request.getParameter("name"));
    }


    @PostMapping("/main")
    @ResponseBody
    public ResponseEntity<?> mainPost() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("key","q1w2e3r4");
        headers.setLocation(URI.create("/main/100"));
        return new ResponseEntity<>(new TestDto1("aa"), headers, HttpStatus.CREATED);
    }


    @PutMapping("/main")
    public ResponseEntity<?> mainPut() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("key","q1w2e3r4");

        return new ResponseEntity<>(new TestDto1("aa"), headers, HttpStatus.CREATED);
    }
}
