package day3Homework2;

public class InstructorManager extends UserManager {

	public void add(Lesson lesson) {
		System.out.println("Ders eklendi." + lesson.lessonName);
	}

	public void delete(Lesson lesson) {
		System.out.printf("{0} Adlý ders silindi." ,lesson.lessonName);
		
	}
	public void update(Lesson lesson) {
		System.out.printf("{0} Adlý ders güncellendi.", lesson.lessonName);
	}
}


