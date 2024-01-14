package com.studantmongodb.persistence.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.studantmongodb.persistence.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
 }
