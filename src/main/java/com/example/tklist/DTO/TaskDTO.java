package com.example.tklist.DTO;

import com.example.tklist.entities.Tasks.Task;
import com.example.tklist.entities.Tasks.TaskPriority;

public class TaskDTO {
    private Long id;
    private String title;
    private String assignee;
    private String description;
    private TaskPriority priority;

    public TaskDTO(){}

    public TaskDTO(Task entity) {
        id = entity.getId();
        title = entity.getTitle();
        assignee = entity.getAssignee();
        description = entity.getDescription();
        priority = entity.getPriority();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getDescription() {
        return description;
    }

    public TaskPriority getPriority() {
        return priority;
    }
}
