package mvc_course.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Student 
{
	private String firstName;
	private String lastName;
	private Sex gender;
	private String university;
	
	//public static ArrayList<Student> list = new ArrayList<Student>();
	
	public static Set<Student> list = new HashSet<Student>();
	
	
	public Student()
	{	
	}
	
	public enum Sex
	{
		MALE, FEMALE
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
	public Sex getGender() {
		return gender;
	}
	public void setGender(Sex gender) {
		this.gender = gender;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	
	
	
}
