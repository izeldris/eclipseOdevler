package day3Homework2;

public class Student extends User {
	int id;
	String[] classes;

	public Student(int id, String[] classes) {
		super();
		this.id = id;
		this.classes = classes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String[] getClasses() {
		return classes;
	}

	public void setClasses(String[] classes) {
		this.classes = classes;
	}
}
