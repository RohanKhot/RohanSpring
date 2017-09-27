package com.mapping1.Jpamapping1.controller;

import com.mapping1.Jpamapping1.model.Department1;
import com.mapping1.Jpamapping1.model.Student1;
import com.mapping1.Jpamapping1.repo.Departrepo1;
import com.mapping1.Jpamapping1.repo.Studentrepo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Studentcontrol1
{
    @Autowired
    Departrepo1 departrepo1;

    @Autowired
    Studentrepo1 studentrepo1;


    @PostMapping(value = "/dac")
    Student1 dar(@RequestBody Student1 student1){
        Student1 dar=studentrepo1.save(student1);
        return dar;
    }

//    @PostMapping(value = "/saveStudent")
//    public ResponseEntity<String> saveStudent(@RequestBody Student1 student1)
//    {
//        studentrepo1.save(student1);
//        ResponseEntity<String> entity=new ResponseEntity<String>("success", HttpStatus.OK);
//        return entity;
//    }

    @GetMapping(value = "/getdata/{dept_id}")
    Student1 data(@PathVariable Integer dept_id){
        Student1 emp=studentrepo1.findOne(dept_id);
        return emp;
    }
    @PostMapping(value = "/save")
    public ResponseEntity<String> save(@RequestBody Student1 student2)
    {
        Department1 dept= student2.getDepartment1();
        if(departrepo1.findOne(dept.getId())!= null){
            studentrepo1.save(student2);
        }
        else{
            departrepo1.save(dept);
            studentrepo1.save(student2);
        }
        ResponseEntity<String> entity=new ResponseEntity<String>("success", HttpStatus.OK);
        return entity;
    }


}
