package pl.dyzma254.demospringdata.dao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Task {

    @Id
    private Long id;

    @ManyToMany(mappedBy = "tasks") private List<Employee> employees;

    private String name;

    public Task(int i) {
        this.id = (long) i;
    }

    public Task(int i, String name) {
        this.id = (long) i;
        this.name = name;
    }

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s [id=%s, name=%s]", "Task", this.id, this.name);
    }
}
