package ru.database.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Employeers")
public class Employee {
    @Id
    private int id;
    private String name;
    private long salary;

    public Employee(int id) {
        this.id = id;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
