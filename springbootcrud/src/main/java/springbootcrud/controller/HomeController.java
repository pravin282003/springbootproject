package springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springbootcrud.model.Student;
import springbootcrud.servicei.StudentServicei;
@Controller
public class HomeController 
{
	
	@Autowired
	StudentServicei ssi;
	@RequestMapping("/")
   public String prelog()
   {
	   return "login";
   }
	@RequestMapping("/openreg")
  public String prereg()
  {
	  return "register";
  }
	@RequestMapping("/save")
	public String savedata(@ModelAttribute Student e)
	{
		ssi.savedata(e);
		return "login"; 
	}
	@RequestMapping("/log")
	public String getdata(@RequestParam("username")String username,@RequestParam("password") String password,Model m)
	{
      List<Student> list=ssi.getdata(username,password);		 
		   if(!list.isEmpty())
		   {
				m.addAttribute("data", list);
				return "success";
		   }
		   else
		   {
			   return "login";
		   }
	}
	@RequestMapping("/delete")
	public String deletedata(@RequestParam("rollno")int rollno,Model m)
	{
		List<Student> list=ssi.deletedata(rollno);
		
		m.addAttribute("data", list);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String editstudent(@RequestParam("rollno")int rollno,Model m)
	{
	   Student s=  ssi.editstudent(rollno);
	     m.addAttribute("stu", s);
		return "edit";
	}
	@RequestMapping("/update")
	public String updatestudent(@ModelAttribute Student s,Model m)
	{
		List<Student> list=ssi.updatestu(s);
		m.addAttribute("data", list);
		return "success";
	}
	
	
	 
}
