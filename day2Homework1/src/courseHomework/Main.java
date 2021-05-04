package courseHomework;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "C# Yazýlým Geliþtirici Yetiþtirme Kurs Kampý", "Engin Demiroð", 98);
		
		
		Course course2 = new Course();
		
		course2.id = 2;
		course2.name = "Java Yazýlým Geliþtirici Kurs Kampý";
		course2.educator = "Engin Demiroð";
		course2.percentage = 8;
		
		Course[] courses = {course1,course2};
		for (Course course : courses) {
			
			System.out.println(course.name);
		}
	}

}
