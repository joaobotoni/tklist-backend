package com.example.tklist.DTO;

import com.example.tklist.entities.Tasks.Task;
import com.example.tklist.entities.Tasks.TaskPriority;
import org.springframework.beans.BeanUtils;


import java.time.LocalDateTime;

public class TaskFormattedDTO {

    private Long id;
    private String title;
    private String assignee;
    private String description;
    private TaskPriority priority;
    private LocalDateTime createdAt;
    private LocalDateTime dueDate;

    public TaskFormattedDTO(){}

    public TaskFormattedDTO(Task entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}

