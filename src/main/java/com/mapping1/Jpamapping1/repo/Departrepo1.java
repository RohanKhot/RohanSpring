package com.mapping1.Jpamapping1.repo;


import com.mapping1.Jpamapping1.model.Department1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Departrepo1 extends JpaRepository<Department1,Integer> {
}
