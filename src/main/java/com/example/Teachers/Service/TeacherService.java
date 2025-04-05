package com.example.Teachers.Service;

import com.example.Teachers.Mapper.TeacherMapper;
import com.example.Teachers.Model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public List<Teacher> getAllTeachers()
    {
        return teacherMapper.getAllTeachers();
    }

    public Teacher getTeacherById(int id)
    {
        return teacherMapper.getTeacherById(id);
    }

    public int addTeacher(Teacher teacher)
    {
        return teacherMapper.addTeacher(teacher);
    }
}
