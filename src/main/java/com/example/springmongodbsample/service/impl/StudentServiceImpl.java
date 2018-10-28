package com.example.springmongodbsample.service.impl;

import com.example.springmongodbsample.dao.StudentRepository;
import com.example.springmongodbsample.entity.Student;
import com.example.springmongodbsample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student findById(String id) {
        return studentRepository.findById(id);
    }
}
