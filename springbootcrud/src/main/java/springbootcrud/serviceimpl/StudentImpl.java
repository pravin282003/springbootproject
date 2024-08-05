package springbootcrud.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootcrud.model.Student;
import springbootcrud.repositary.Studentrepositary;
import springbootcrud.servicei.StudentServicei;
@Service
public class StudentImpl implements StudentServicei
{
     @Autowired
     Studentrepositary sr;
	
	@Override
	public void savedata(Student e)
	{
		sr.save(e);
	}

	@Override
	public List<Student> getdata(String username, String password)
	{
		if(username.equals("admin")&&password.equals("admin"))
		{
			return sr.findAll();
		}
		else
		{
			return sr.findByUsernameAndPassword(username,password);
			
		}
		
	}

	@Override
	public List<Student> deletedata(int rollno) {
		  sr.deleteById(rollno);
		  return sr.findAll();
	}

	@Override
	public Student editstudent(int rollno) {
		Optional<Student> op=sr.findById(rollno);
		return op.get();
	}

	@Override
	public List<Student> updatestu(Student s) {
		sr.save(s);
		return sr.findAll();
	}

}
