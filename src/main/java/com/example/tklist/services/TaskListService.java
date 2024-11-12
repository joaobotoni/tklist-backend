package com.example.tklist.services;

import com.example.tklist.DTO.TaskFormattedDTO;
import com.example.tklist.DTO.TaskListDTO;
import com.example.tklist.repository.TaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskListService {

    @Autowired
    private TaskListRepository repository;

    @Transactional(readOnly = true)
    public List<TaskListDTO> findAll(){
        var result = repository.findAll();
        return result.stream().map(TaskListDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public TaskListDTO findById(Long id){
        var result = repository.findById(id).get();
        return new TaskListDTO(result);
    }

}
