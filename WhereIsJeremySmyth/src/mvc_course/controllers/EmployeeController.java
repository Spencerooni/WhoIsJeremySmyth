package mvc_course.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import mvc_data.Employee;
import mvc_data.EmployeeService;

@Controller
@SessionAttributes("employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="index.mvc", method=RequestMethod.GET)
	public String setupEmployee(Model model, HttpServletRequest request) {
		Employee employee = new Employee();
		employee.setEmpID(request.getParameter("employeeNum"));
		employee.setfirstName(request.getParameter("firstName"));
		employee.setlastName(request.getParameter("lastName"));
		model.addAttribute("employee", employee);
		return "employee_details";
	}
	
	@RequestMapping(value="index.mvc", method=RequestMethod.POST)
	public String setupEmployee(@ModelAttribute("employee") Employee employee, Model model) {
		if(employeeService.getEmplyeeByID(employee.getEmpID())) {
			model.addAttribute("message", "Employee ID exists. Try again");
			return "employee_details";
		} else {
			employeeService.insertEmployee(employee);
			model.addAttribute("message", "Employee added");
			return "employee_details";
		}
	}
}
