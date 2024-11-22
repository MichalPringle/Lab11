/*File: Person.java
 * Class: CSCI1302
 * Author: Anslie Pettit, Michal Pringle
 * Created On: Nov 22, 2024
 * Last Modified: Nov 22, 2024
 * Description: 
 * 
 */

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

public class Person implements Comparable<Person>, Serializable {
	protected int age;			// Declares data fields 
	protected String name;
	protected String address;
	protected int zipCode;
	protected double salary;
	
	public int getAge() {		// Getters and setters for data fields
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAdress(String address) {
		this.address = address;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Person() {				// Default constructor
		this.age = 0;
		this.name = "N/A";
		this.address = "N/A";
		this.zipCode = 00000;
		this.salary = 0.0;
	}
	public Person(int age, String name, String address, int zipCode, double salary) {		// Convenience constructor
		this.age = age;
		this.name = name;
		this.address = address;
		this.zipCode = zipCode;
		this.salary = salary;
	}
	@Override							// Overrriden compareTo method
	public int compareTo(Person o){
		return Double.compare(o.salary, this.salary);
		
	}
	@Override					// Overriden toString method that formats person info
	public String toString() {
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
		return age + " " + name + " " + address + " " + zipCode + " " + currencyFormat.format(salary);
	}
}
