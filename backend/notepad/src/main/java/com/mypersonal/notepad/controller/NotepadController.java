package com.mypersonal.notepad.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class NotepadController {


    @GetMapping(value = "/hello", name = "return hello world")
    public String hello(@RequestParam(value = "name", required = false) String name) {
        return name == null ? "hello world": "hello" + name;
    }

    @PostMapping(value = "/savefile",name = "save user input")
    public void save(@RequestParam(value = "name", required = false) String name,
                     @RequestBody Map requestBody) {
        System.out.println(requestBody.size());
        String userId = (String) requestBody.get("id");
        String date = (String) requestBody.get("date");
        String value = (String) requestBody.get("content");


    }
}