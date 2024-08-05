package springbootcrud.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootcrud.model.Student;
@Repository
public interface Studentrepositary extends JpaRepository<Student, Integer>

{

	List<Student> findByUsernameAndPassword(String username, String password);

}
