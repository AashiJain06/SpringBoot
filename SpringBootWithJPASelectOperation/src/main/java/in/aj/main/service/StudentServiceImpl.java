package in.aj.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.aj.main.enitiy.Student;
import in.aj.main.repository.StudentRepository;
@Service

public class StudentServiceImpl implements StudentService
{
	@Autowired
    private StudentRepository stdRepo;
	@Override
	public List<Student> getStudent() {
		
		List<Student> std = stdRepo.findAll();
	
		
		return std;
		
	}
	@Override
	public Student getStudentById(Long id) {
		Optional<Student> optional = stdRepo.findById(id);
		if(optional.isPresent())
		{
			return optional.get();
		}
		return null;
	}

}
