package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.model.CourseModel;

public interface CourseDAO {
	 CourseModel selectCoursesStudent (String id_course);
	 List<CourseModel> selectAllCourses();
}
