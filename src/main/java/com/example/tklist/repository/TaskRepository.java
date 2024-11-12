package com.example.tklist.repository;

import com.example.tklist.entities.Tasks.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByTaskListsId(Long listId);
}
