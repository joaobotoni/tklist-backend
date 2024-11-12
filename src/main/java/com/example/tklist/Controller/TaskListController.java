package com.example.tklist.Controller;
import com.example.tklist.DTO.TaskListDTO;
import com.example.tklist.services.TaskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/lists")
public class TaskListController {

    @Autowired
    private TaskListService service;

    @GetMapping
    public List<TaskListDTO> findAll(){
        return service.findAll();
    }
    
}
