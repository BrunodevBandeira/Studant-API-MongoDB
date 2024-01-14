package com.studantmongodb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studantmongodb.model.StudentRequest;
import com.studantmongodb.model.StudentResponse;
import com.studantmongodb.persistence.entity.Student;
import com.studantmongodb.persistence.repository.StudentRepository;


@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public StudentResponse create(StudentRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setDocument(request.getDocument());
        student.setBirthDate(request.getBirthDate());

        repository.save(student);

        StudentResponse response = new StudentResponse();
        response.setId(student.getId());
        response.setName(student.getName());
        response.setDocument(student.getDocument());
        response.setBirthDate(student.getBirthDate());

        repository.save(student);
        return createResponse(student);
    }

    @Override
    public List<StudentResponse> getAll() {
        List<StudentResponse> responses = new ArrayList<>();

        List<Student> students = repository.findAll();
        if (!students.isEmpty()) {
            students.forEach(student -> responses.add(createResponse(student)));
        }

        return responses;
    }

    private StudentResponse createResponse(Student student) {
        StudentResponse response = new StudentResponse();
        response.setId(student.getId());
        response.setName(student.getName());
        response.setDocument(student.getDocument());
        response.setBirthDate(student.getBirthDate());

        return response;
    }


    @Override
    public StudentResponse update(String id, StudentRequest request) {
        Optional<Student> optionalStudent = repository.findById(id);

        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            // Atualiza os campos do estudante existente com os novos valores
            existingStudent.setName(request.getName());
            existingStudent.setDocument(request.getDocument());
            existingStudent.setBirthDate(request.getBirthDate());

            // Salva o estudante atualizado no banco de dados
            repository.save(existingStudent);

            // Cria e retorna a resposta atualizada
            return createResponse(existingStudent);
        } else {
            // Lida com o caso em que o estudante com o ID fornecido não foi encontrado
            // Pode lançar uma exceção ou retornar um objeto indicando que o estudante não existe
            return null;
        }
    }


    @Override
    public void delete(String id) {
        // Implementação do método de exclusão
        repository.deleteById(id);
    }

    
}
