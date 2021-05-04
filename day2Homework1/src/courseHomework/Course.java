package courseHomework;

public class Course {
	
	
public Course() {
	System.out.println("Costructor Çalýþtý.");
}
public Course(int id, String name, String educator, double percentage) {
	this.id=id;
	this.name=name;
	this.educator=educator;
	this.percentage=percentage;
}

int id;
String name;
String educator;
double percentage;

}
