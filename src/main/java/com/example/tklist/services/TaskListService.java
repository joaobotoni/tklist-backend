package com.example.tklist.services;

import com.example.tklist.DTO.TaskFormattedDTO;
import com.example.tklist.DTO.TaskListDTO;
import com.example.tklist.repository.TaskListRepository;
import com.example.tklist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskListService {

    @Autowired
    private TaskListRepository repository;

    @Autowired
    private TaskRepository taskRepository;

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

    @Transactional
    public void move(Long id, int sourceIndex, int destinationIndex){
         var list = taskRepository.findAllByTaskListsId(id);
         var obj = list.remove(sourceIndex);
         list.add(destinationIndex, obj);

         int min = Math.min(sourceIndex, destinationIndex);
         int max = Math.max(sourceIndex,destinationIndex);

         for(int i = min; i <= max; i++){
           repository.updateBelongingPosition(id,list.get(i).getId(),i);
         }
    }

}
