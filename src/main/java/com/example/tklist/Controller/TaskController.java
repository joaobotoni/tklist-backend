package com.example.tklist.Controller;

import com.example.tklist.DTO.TaskDTO;
import com.example.tklist.DTO.TaskFormattedDTO;
import com.example.tklist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(value = "/{id}")
    public TaskFormattedDTO findById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping("/lists/{listId}")
    public ResponseEntity<List<TaskDTO>> getTasksByList(@PathVariable Long listId) {
        List<TaskDTO> tasks = service.findAllByList(listId);
        return ResponseEntity.ok(tasks);
    }

}
