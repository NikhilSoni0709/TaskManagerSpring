package com.TaskManager.TaskManager.Controllers;


import com.TaskManager.TaskManager.JPA.HandlerRepository;
import com.TaskManager.TaskManager.Models.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/handler")
public class HandlerRestController {

    @Autowired
    HandlerRepository handlerRepository;

    @GetMapping("/{id}")
    public Handler getHandlerById(@PathVariable int id){
        return handlerRepository.findById(id);
    }

    @GetMapping
    public List<Handler> getAllHandlers(){
        return handlerRepository.findAll();
    }

}
