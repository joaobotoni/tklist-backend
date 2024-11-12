package com.example.tklist.entities.Belonging;

import com.example.tklist.entities.Tasks.Task;
import com.example.tklist.entities.Tasks.TaskList;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

import java.util.Objects;

@Embeddable
public class BelongPk {

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private TaskList list;

    public BelongPk(){}

    public BelongPk(Task task, TaskList list) {
        this.task = task;
        this.list = list;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public TaskList getList() {
        return list;
    }

    public void setList(TaskList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongPk belongPk = (BelongPk) o;
        return Objects.equals(task, belongPk.task) && Objects.equals(list, belongPk.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, list);
    }
}
