package com.example.tklist.services;

import com.example.tklist.DTO.TaskDTO;
import com.example.tklist.entities.Task;
import com.example.tklist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<TaskDTO> findAll(){
        var result = repository.findAll();
        return result.stream().map(TaskDTO::new).toList();
    }

}
