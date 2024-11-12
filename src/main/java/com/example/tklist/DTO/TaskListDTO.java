package com.example.tklist.DTO;

import com.example.tklist.entities.Tasks.TaskList;


public class TaskListDTO {
    private long id;
    private String name;

    public TaskListDTO(){}

    public TaskListDTO(TaskList entity){
        id = entity.getId();
        name = entity.getName();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
