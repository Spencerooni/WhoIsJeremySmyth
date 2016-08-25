package mvc_data;

/**
 * Basic POJO class for first Spike
 */
public class Employee {

	private String empID, firstName, lastName;
	private String addressLineOne, addressLineTwo, addressLineThree;
	private String city, county, postCode;
	private String country, emailAddress, natInsuranceNum;
	private String accountName, IBAN, BIC;
	private int startSalary;
	
	
	/**
	 * Empty Constructor
	 */
	public Employee() {}
	
	/**
	 * A constructor with ALL the parameters
	 */
	public Employee(String empID, String firstName, String lastName, String addressLineOne,
			String addressLineTwo, String addressLineThree, String city, String county, 
			String postCode, String country, String emailAddress, String natInsuranceNum, 
			String accountName, String IBAN, String BIC, int startSalary) {
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.addressLineThree = addressLineThree;
		this.city = city;
		this.county = county;
		this.country = country;
		this.postCode = postCode;
		this.emailAddress = emailAddress;
		this.natInsuranceNum = natInsuranceNum;
		this.accountName = accountName;
		this.IBAN = IBAN;
		this.BIC = BIC;
		this.startSalary = startSalary;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getAddressLineThree() {
		return addressLineThree;
	}

	public void setAddressLineThree(String addressLineThree) {
		this.addressLineThree = addressLineThree;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getNatInsuranceNum() {
		return natInsuranceNum;
	}

	public void setNatInsuranceNum(String natInsuranceNum) {
		this.natInsuranceNum = natInsuranceNum;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public String getBIC() {
		return BIC;
	}

	public void setBIC(String bIC) {
		BIC = bIC;
	}

	public int getStartSalary() {
		return startSalary;
	}

	public void setStartSalary(int startSalary) {
		this.startSalary = startSalary;
	}
	
	
}
