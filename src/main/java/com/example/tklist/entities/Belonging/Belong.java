package com.example.tklist.entities.Belonging;

import com.example.tklist.entities.Tasks.Task;
import com.example.tklist.entities.Tasks.TaskList;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "belong")
public class Belong {
    @EmbeddedId
    private BelongPk pk = new BelongPk();
    private Integer position_task;

    public Belong(){}

    public Belong(Task task, TaskList list,  Integer position) {
        pk.setTask(task);
        pk.setList(list);
        this.position_task = position;
    }

    public BelongPk getPk() {
        return pk;
    }

    public void setPk(BelongPk pk) {
        this.pk = pk;
    }

    public Integer getPosition() {
        return position_task;
    }

    public void setPosition(Integer position) {
        this.position_task = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belong belong = (Belong) o;
        return Objects.equals(pk, belong.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pk);
    }
}
