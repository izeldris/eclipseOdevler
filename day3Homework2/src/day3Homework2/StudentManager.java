package day3Homework2;

public class StudentManager extends UserManager {
	
	public void register(Lesson lesson) {
		System.out.printf("{0} Kursuna kay�t ba�ar�l�.", lesson.getLessonName());
	}
	public void showClass(Lesson lesson) {
		System.out.println("Kay�tl� olunan kurslar." + lesson.getLessonName());
	}
}
