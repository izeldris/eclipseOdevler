package day3Homework2;

public class StudentManager extends UserManager {
	
	public void register(Lesson lesson) {
		System.out.printf("{0} Kursuna kayýt baþarýlý.", lesson.getLessonName());
	}
	public void showClass(Lesson lesson) {
		System.out.println("Kayýtlý olunan kurslar." + lesson.getLessonName());
	}
}
