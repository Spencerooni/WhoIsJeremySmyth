package mvc_data;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface IEmployeeMapper 
{
	@Insert("INSERT INTO employee(employee_id,first_name,last_name) VALUES "
			+ "('#{empID}', '#{firstName}','#{lastName}')")
	void insertEmployee(Employee newEmployee);
	
	
	@Select("SELECT employee_id FROM employee WHERE employee_id = '#{empID}")
	public Employee getEmployeeByID(String empID);
	
	
}
