package com.example.tklist.repository;

import com.example.tklist.entities.Tasks.TaskList;
import com.example.tklist.entities.Belonging.BelongPk;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface TaskListRepository extends JpaRepository<TaskList, Long> {

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE belong SET position_task = :newPosition WHERE list_id = :listId AND task_id = :taskId")
    void updateBelongingPosition(Long listId, Long taskId, Integer newPosition);


}
