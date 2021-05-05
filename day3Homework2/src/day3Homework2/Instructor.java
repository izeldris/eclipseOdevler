package day3Homework2;

public class Instructor extends User {
	int id;
	String branch;
	String[] courses;

	public Instructor() {
	}

	public Instructor(int id, String branch, String[] courses) {
		super();
		this.id = id;
		this.branch = branch;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

}
