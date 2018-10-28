package com.example.springmongodbsample.dao;

import com.example.springmongodbsample.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentRepository {

    Student findById(String id);
}
