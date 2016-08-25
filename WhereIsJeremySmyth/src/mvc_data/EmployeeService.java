package mvc_data;

import mvc_data.Employee;

public interface EmployeeService {

	void insertEmployee(Employee employee);
	boolean getEmplyeeByID(String empID);

}
