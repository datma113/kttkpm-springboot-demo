package thanhdat.springDataJPA;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import thanhdat.entity.Student;
import thanhdat.repository.StudentRepository;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Test
	void contextLoads() {
	}

	
	@Autowired
	StudentRepository studentRepository;
	
	
	@Test
	void getAllStudents() {
		List<Student> students = studentRepository.getAllStudents();
		System.out.println(students);
	}
	
	
	@Test
	void updateStudentById() {
		studentRepository.updateStudentById(1, "datma", "lala", "ddddssss@gmail.com");
	}
	
	
	@Test
	void deleteStudentById(int id) {
		studentRepository.deleteStudentById(1);
	}
}
