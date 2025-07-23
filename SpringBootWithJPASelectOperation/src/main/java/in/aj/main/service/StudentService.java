package in.aj.main.service;

import java.util.List;

import in.aj.main.enitiy.Student;

public interface StudentService {
	public List<Student> getStudent();
	public Student getStudentById(Long id);
	

}
