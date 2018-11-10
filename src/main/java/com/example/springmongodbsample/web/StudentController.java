package com.example.springmongodbsample.web;

import com.example.springmongodbsample.entity.Student;
import com.example.springmongodbsample.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "学生模块")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

//    @ApiOperation(value = "查找学生", notes = "通过id查找学生")
//    @ApiImplicitParam(value = "用户id")
//    @GetMapping(value = "/student/{id}")
//    public Student findById(@PathVariable(value = "id") String id) {
//
//        return studentService.findById(id) ;
//    }

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable(value = "name") String name) {
        return "hello:"+name;
    }
}
