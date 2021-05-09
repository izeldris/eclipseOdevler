package entities;

import abstracts.IEntity;

public class Employee extends User implements IEntity {
	private double salary;
	private String homePhone;
	private String bloodType;

	public Employee() {

	}

	public Employee(double salary, String homePhone, String bloodType) {
		super();
		this.salary = salary;
		this.homePhone = homePhone;
		this.bloodType = bloodType;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
}
