package com.example.tklist.services;

import com.example.tklist.DTO.TaskDTO;
import com.example.tklist.DTO.TaskFormattedDTO;
import com.example.tklist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    @Transactional(readOnly = true)
    public TaskFormattedDTO findById(Long id){
        var result = repository.findById(id).get();
        return new TaskFormattedDTO(result);
    }

    @Transactional(readOnly = true)
    public List<TaskDTO> findAll(){
        var result = repository.findAll();
        return result.stream().map(TaskDTO::new).toList();
    }

}
