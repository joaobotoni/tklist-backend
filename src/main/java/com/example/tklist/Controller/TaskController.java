package com.example.tklist.Controller;

import com.example.tklist.DTO.TaskDTO;
import com.example.tklist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public List<TaskDTO> findAll(){
        return service.findAll();
    }

}
