package in.aj.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.aj.main.enitiy.Student;

public interface StudentRepository extends JpaRepository<Student, Long>
{

}
