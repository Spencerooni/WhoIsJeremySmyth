package mvc_data;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface IEmployeeMapper 
{
	@Insert("INSERT INTO employee(employee_id,first_name,last_name,address_line_1,"
			+ "address_line_2,address_line_3,city,county,postcode,country,"
			+ "email_address,national_insurance_uk,account_name,IBAN,BIC"
			+ ",start_salary) VALUES "
			+ "(#{empID}, #{firstName},#{lastName}, #{addressLineOne},"
			+ "#{addressLineTwo},#{addressLineThree},#{city},#{county},#{postCode},"
			+ "#{country},#{emailAddress},#{natInsuranceNum},#{accountName},#{IBAN},"
			+ "#{BIC}),#{startSalary}")
	void insertEmployee(Employee newEmployee);
	
	
//	@Select("SELECT employee_id FROM employee WHERE employee_id = '#{empID}")
//	public Employee getEmployeeByID(String empID);
//	
//	
}
