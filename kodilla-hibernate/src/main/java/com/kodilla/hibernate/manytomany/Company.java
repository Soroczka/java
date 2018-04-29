package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@NamedNativeQuery(
        name = "Company.findNameByFirstThreeChars",
        query = "SELECT * FROM COMPANY " +
                "WHERE LEFT (NAME, 3) = :THREECHARS",
        resultClass = Company.class
)

@Entity
public class Company {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToMany(cascade =  CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
