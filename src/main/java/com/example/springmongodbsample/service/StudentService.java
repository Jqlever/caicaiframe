package com.example.springmongodbsample.service;

import com.example.springmongodbsample.entity.Student;

public interface StudentService {

    Student findById(String id);
}
