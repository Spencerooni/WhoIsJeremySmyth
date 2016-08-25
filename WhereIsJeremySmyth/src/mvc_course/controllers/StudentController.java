package mvc_course.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mvc_course.models.Student;
import mvc_course.models.Student.Sex;

@Controller
public class StudentController 
{
	@RequestMapping(value="setup.mvc")
	public String setupStudents()
	{
		Student s = new Student();
		s.setFirstName("Matt");
		s.setLastName("Smith");
		s.setGender(Student.Sex.MALE);
		s.setUniversity("University of East Anglia");
		
		Student.list.add(s);
		s = new Student();
		
		s.setFirstName("Jenni");
		s.setLastName("Patton");
		s.setGender(Student.Sex.FEMALE);
		s.setUniversity("Florida State University");
		
		Student.list.add(s);
		s = new Student();
		
		return "redirect:listStudents.mvc";
	}
	
	
	@RequestMapping(value="listStudents.mvc")
	public ModelAndView listStudents(ModelAndView mav)
	{
		mav.setViewName("studentList");
		mav.addObject("studentList", Student.list);
		return mav;
	}
	
}
