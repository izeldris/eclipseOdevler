package courseHomework;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "C# Yaz�l�m Geli�tirici Yeti�tirme Kurs Kamp�", "Engin Demiro�", 98);
		
		
		Course course2 = new Course();
		
		course2.id = 2;
		course2.name = "Java Yaz�l�m Geli�tirici Kurs Kamp�";
		course2.educator = "Engin Demiro�";
		course2.percentage = 8;
		
		Course[] courses = {course1,course2};
		for (Course course : courses) {
			
			System.out.println(course.name);
		}
	}

}
