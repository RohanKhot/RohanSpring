package com.mapping1.Jpamapping1.controller;

import com.mapping1.Jpamapping1.model.Department1;
import com.mapping1.Jpamapping1.model.Student1;
import com.mapping1.Jpamapping1.repo.Departrepo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Departcontroller1 {

    @Autowired
    Departrepo1 departrepo1;

    @PostMapping(value = "/saveDept")
    public ResponseEntity<String> saveDept(@RequestBody Department1 department1)
    {
        Department1 depart1= departrepo1.save(department1);

        ResponseEntity<String> entity=new ResponseEntity<String>("success", HttpStatus.OK);
        return entity;
    }

        @GetMapping(value = "/getdataDept/{id}")
    Department1 data(@PathVariable Integer id){
        Department1 emp=departrepo1.findOne(id);
        return emp;}

        @GetMapping(value = "/getalldata")
        List<Department1> data()
        {
            List<Department1> list=departrepo1.findAll();
            return list;
        }

        @GetMapping(value = "/deletecascad/{id}")
    String em(@PathVariable Integer id){
        departrepo1.delete(id);
       return "deleted";

        }

}
