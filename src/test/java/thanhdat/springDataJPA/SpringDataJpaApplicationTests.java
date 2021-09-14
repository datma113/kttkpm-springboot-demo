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
	private StudentRepository studentRepository;
	
	@Test
	void addStudent() {
		Student student = new Student("thanh", "dat", "assddaaa@gmail.com");
		studentRepository.save(student);
	}
	
	@Test
	void getStudents() {
		List<Student> students = studentRepository.findAll();
		System.out.println(students);
	}
	
	@Test
	void deleteStudentById(int id) {
		studentRepository.deleteById(1);
	}
}
