package com.scaler.simpleserver.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")

public class Taskscontroller {
    @GetMapping("")
    public String getAllTasks() {
        return "TODO: All Tasks";
    }

    @GetMapping("/{id}")
    public String getTaskById(@PathVariable("id") String id){
        return "TODO: Task no = " + id;
    }


}
