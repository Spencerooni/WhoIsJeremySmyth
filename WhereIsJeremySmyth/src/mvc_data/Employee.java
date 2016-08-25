package mvc_data;

/**
 * Basic POJO class for first Spike
 */
public class Employee {

	private String empID;
	private String firstName;
	private String lastName;
	
	/**
	 * Empty Constructor
	 */
	public Employee() {}
	
	public Employee(String empID, String firstName, String lastName) {
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
