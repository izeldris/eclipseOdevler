package day3Homework2;

public class UserManager {
	public void signup(int id, String userName, String password, String firstName, String lastName, String email,
			String userType) {
		System.out.println("Kullan�c� kay�t edildi.");
	}

	public void add(User user) {
		System.out.printf("{0} Adl� Kullan�c� {1} Olarak Eklendi." , user.getUserName(), user.getUserType());
	}

	public void delete(int id, String userName) {
		System.out.println("Kullan�c� kayd� silindi." + userName);
	}

	public void loginUserName(String userName, String password) {
		System.out.println("Giri� ba�ar�l�.");
	}

	public void loginEmail(String email, String password) {
		System.out.println("Giri� ba�ar�l�.");
	}
}
