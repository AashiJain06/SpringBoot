package in.aj.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.aj.main.entity.Student;
import in.aj.main.repository.StudentRepository;
@Repository

public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean insertStudent(Student std) {
		boolean status = false;
		try
		{
			studentRepository.save(std);
			status = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error Occured :"+e.getMessage());
			status = false;
			
		}
		return status;
		
		
	}
	

}
