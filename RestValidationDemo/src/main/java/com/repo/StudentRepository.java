package com.repo;

import com.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,String> {
    public Optional<Student> findByNameIgnoreCase(String name);
}
