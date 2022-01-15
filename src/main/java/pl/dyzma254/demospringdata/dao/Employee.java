package pl.dyzma254.demospringdata.dao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    private Long id;

    @ManyToMany(cascade = CascadeType.REMOVE)
    private List<Task> tasks;

    public Employee(int i) {
        this.id = (long) i;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return String.format("%s [id=%s]", "Employee", this.id);
    }
}
