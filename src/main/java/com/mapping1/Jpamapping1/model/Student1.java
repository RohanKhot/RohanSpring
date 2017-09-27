package com.mapping1.Jpamapping1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student1 {

    @Id
    private Integer id;
    private String name;
    private String city;

    @ManyToOne
    @JoinColumn(name ="dept_id" )
    private Department1 department1;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }




    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", department1=" + department1 +
                '}';
    }

    public Department1 getDepartment1() {
        return department1;
    }

    public void setDepartment1(Department1 department1) {
        this.department1 = department1;
    }


}
