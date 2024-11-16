package com.example.tklist.services;

import com.example.tklist.DTO.TaskDTO;
import com.example.tklist.DTO.TaskFormattedDTO;
import com.example.tklist.entities.Tasks.Task;
import com.example.tklist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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


    @Transactional(readOnly = true)
    public List<TaskDTO> findAllByList(Long id) {
        var tasks = repository.findAllByTaskListsId(id);
        return tasks.stream().map(TaskDTO::new).collect(Collectors.toList());
    }

}
