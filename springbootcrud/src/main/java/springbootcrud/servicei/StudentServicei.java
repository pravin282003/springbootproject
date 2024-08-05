package springbootcrud.servicei;

import java.util.List;

import springbootcrud.model.Student;

public interface StudentServicei 
{
	

	void savedata(Student e);

	List<Student> getdata(String username, String password);

	List<Student> deletedata(int rollno);

	Student editstudent(int rollno);

	List<Student> updatestu(Student s);

}
