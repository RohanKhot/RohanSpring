package com.mapping1.Jpamapping1.repo;

import com.mapping1.Jpamapping1.model.Student1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepo1 extends JpaRepository<Student1,Integer> {
}
