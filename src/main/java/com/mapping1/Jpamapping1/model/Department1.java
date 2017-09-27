package com.mapping1.Jpamapping1.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Department1 {

    @Id
    private Integer id;
    private String dept_name;

    @OneToMany(mappedBy = "department1",cascade = CascadeType.ALL)
    public Set<Student1> student1s;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Set<Student1> getStudent1s() {
        return student1s;
    }

    public void setStudent1s(Set<Student1> student1s) {
        this.student1s = student1s;
    }




    @Override
    public String toString() {
        return "Department1{" +
                "id=" + id +
                ", dept_name='" + dept_name + '\'' +
                ", student1s=" + student1s +
                '}';
    }









}
