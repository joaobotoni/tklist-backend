package com.example.tklist.repository;

import com.example.tklist.entities.Tasks.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
