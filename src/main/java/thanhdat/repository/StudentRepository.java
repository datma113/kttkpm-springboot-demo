package thanhdat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thanhdat.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
