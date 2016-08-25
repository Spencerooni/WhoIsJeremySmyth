package mvc_data;

/**
 * Basic POJO class for first Spike
 */
public class Employee {

	private String empID;
	private String fName;
	private String lName;
	
	/**
	 * Empty Constructor
	 */
	public Employee() {}
	
	public Employee(String empID, String fName, String lName) {
		this.empID = empID;
		this.fName = fName;
		this.lName = lName;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
}
