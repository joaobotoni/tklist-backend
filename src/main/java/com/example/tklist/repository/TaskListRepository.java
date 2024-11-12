package com.example.tklist.repository;

import com.example.tklist.entities.Tasks.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskListRepository extends JpaRepository<TaskList, Long> {
}
