package com.example.tklist.entities.Tasks;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String assignee;
    private String description;
    private TaskPriority priority;
    private LocalDateTime createdAt;
    private LocalDateTime dueDate;

    // Relacionamento Many-to-Many com a tabela task_list através da tabela de junção 'belong'
    @ManyToMany(fetch = FetchType.EAGER) // Aqui estamos utilizando FetchType.EAGER para carregar as listas associadas
    @JoinTable(
            name = "belong",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "list_id")
    )
    private List<TaskList> taskLists;

    public Task() {}

    public Task(Long id, String title, String assignee, String description, TaskPriority priority, LocalDateTime createdAt, LocalDateTime dueDate) {
        this.id = id;
        this.title = title;
        this.assignee = assignee;
        this.description = description;
        this.priority = priority;
        this.createdAt = createdAt;
        this.dueDate = dueDate;
    }

    // Getters e setters

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

    public List<TaskList> getTaskLists() {
        return taskLists;
    }

    public void setTaskLists(List<TaskList> taskLists) {
        this.taskLists = taskLists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
