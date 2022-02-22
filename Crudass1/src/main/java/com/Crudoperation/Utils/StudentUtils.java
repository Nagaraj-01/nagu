package com.Crudoperation.Utils;

import com.Crudoperation.DTO.StudentDTO;
import com.Crudoperation.Entity.Student;

public class StudentUtils {
	public static Student convertStudentDTOToDO(StudentDTO studentDTO) {
		
		Student student =new Student();
		
		student.setId(studentDTO.getId());
		student.setStudent_Name(studentDTO.getStudent_Name());
		student.setCourse(studentDTO.getCourse());
		student.setDepartment(studentDTO.getDepartment());
		student.setYear(studentDTO.getYear());
		return student;
		
	}
	public static StudentDTO convertStudentDOToDTO (Student student) {
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setId(student.getId());
		studentDTO.setStudent_Name(student.getStudent_Name());
		studentDTO.setCourse(student.getCourse());
		studentDTO.setDepartment(student.getDepartment());
		studentDTO.setYear(student.getYear());
		return studentDTO;
		
	}

}
