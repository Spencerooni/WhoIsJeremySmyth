package mvc_course.controllers;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import mvc_data.Employee;
import mvc_data.EmployeeService;
import mvc_data.IEmployeeMapper;

@Controller
public class EmployeeController {
	
	@Autowired
	IEmployeeMapper employeeMapper;
	
	@RequestMapping(value="index.mvc", method=RequestMethod.POST)
	public String setupEmployeeG(Model model, HttpServletRequest request) {
		Employee employee = new Employee();
		System.out.println("1" + request.getParameter("employeeNum"));
		
		employee.setEmpID(request.getParameter("employeeNum").toString());
		employee.setfirstName(request.getParameter("firstName"));
		employee.setlastName(request.getParameter("lastName"));
		model.addAttribute("employee", employee);
		
		System.out.println("2" + request.getParameter("employeeNum"));
		
		employeeMapper.insertEmployee(employee);
		
		
		System.out.println("3" + request.getParameter("employeeNum"));
		
		return "employee_details";
	}
	
	
	
	@Autowired
	private DataSource dataSource;
	
	
	
//	@RequestMapping(value="index.mvc")
//	public String landingPage(Model m)
//	{
//		m.addAttribute("msg", "Please complete this employee details form");
//		return "employee_details";
//	}
	
	
	
	
	@RequestMapping(value="index.mvc")
	public String cityLList(Model m) {
	   try {
	      Connection c = dataSource.getConnection();
////	      Statement s = c.createStatement();
////	      String sql = "SELECT Name, District, Population "
////	         + "FROM City WHERE CountryCode = 'GBR'";
////	      ResultSet rs = s.executeQuery(sql);
////	      List<String[]> rows = new ArrayList<String[]>();
////	      
////	      while(rs.next()){
////	         String[] row = { 
////	               rs.getString(1),
////	               rs.getString(2),
////	               rs.getString(3) };
////	         rows.add(row);
////	      }
////	   
////	      m.addAttribute("rows", rows);
	   } catch (Exception e) {
	      System.out.println(e.getMessage());
	   }
	   return "employee_details"; 
	}
}
	
	

