package com.studantmongodb.controller; 

import org.springframework.web.bind.annotation.RestController;

import com.studantmongodb.model.StudentRequest;
import com.studantmongodb.model.StudentResponse;
import com.studantmongodb.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/v1")
public class StudentController {

    @Autowired
    private StudentService service;
    
    @PostMapping
    public ResponseEntity<StudentResponse> create(@RequestBody StudentRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentResponse> update(@PathVariable String id, @RequestBody StudentRequest request) {

        StudentResponse updatedStudent = service.update(id, request);

        if (updatedStudent != null) {
            return ResponseEntity.ok(updatedStudent);
        } else {
            // Pode personalizar a resposta se o estudante não for encontrado
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        // Pode personalizar a resposta de sucesso
        return ResponseEntity.ok().build();
    }

}
