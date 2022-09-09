package com.example.restproject.Model;

import javax.persistence.*;
import java.sql.Date;
import java.util.*;

@Entity
@Table(name="Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Date dateStart;
    @OneToMany(mappedBy = "course")
    private Set<Customer> customerList;

    public Course(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Set<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(Set<Customer> customerList) {
        this.customerList = customerList;
    }

}
