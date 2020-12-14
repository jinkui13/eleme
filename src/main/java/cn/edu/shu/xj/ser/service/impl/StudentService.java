package cn.edu.shu.xj.ser.service.impl;


import cn.edu.shu.xj.ser.entity.Student;
import cn.edu.shu.xj.ser.mapper.StudentMapper;
import cn.edu.shu.xj.ser.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService implements IStudentService {

    @Autowired
    StudentMapper studentMapper;

    public Student findOneStudent(Integer sid){
        return studentMapper.findOneStudent(sid);
    }

    @Override
    public Integer querystudentage(String name) {
        return studentMapper.querystudentage(name);
    }
}
