package com.example.Teachers.Mapper;

import com.example.Teachers.Model.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TeacherMapper {

 //   @Select("Select * from Teachers")
    List<Teacher> getAllTeachers();

}
