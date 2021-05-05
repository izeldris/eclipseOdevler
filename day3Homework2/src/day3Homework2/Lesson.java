package day3Homework2;

public class Lesson {
int id;
String lessonName;
String [] instructors;
String [] students;

public Lesson(int id, String lessonName, String[] instructors, String[] students) {
	super();
	this.id = id;
	this.lessonName = lessonName;
	this.instructors = instructors;
	this.students = students;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getLessonName() {
	return lessonName;
}

public void setLessonName(String lessonName) {
	this.lessonName = lessonName;
}

public String[] getInstructors() {
	return instructors;
}

public void setInstructors(String[] instructors) {
	this.instructors = instructors;
}

public String[] getStudents() {
	return students;
}

public void setStudents(String[] students) {
	this.students = students;
}
}
