package cn.edu.shu.xj.ser.service;

import cn.edu.shu.xj.ser.entity.Student;

public interface IStudentService {
    Student findOneStudent(Integer sid);

    Integer querystudentage(String name);
}
