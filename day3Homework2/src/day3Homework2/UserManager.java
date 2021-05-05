package day3Homework2;

public class UserManager {
	public void signup(int id, String userName, String password, String firstName, String lastName, String email,
			String userType) {
		System.out.println("Kullanýcý kayýt edildi.");
	}

	public void add(User user) {
		System.out.printf("{0} Adlý Kullanýcý {1} Olarak Eklendi." , user.getUserName(), user.getUserType());
	}

	public void delete(int id, String userName) {
		System.out.println("Kullanýcý kaydý silindi." + userName);
	}

	public void loginUserName(String userName, String password) {
		System.out.println("Giriþ baþarýlý.");
	}

	public void loginEmail(String email, String password) {
		System.out.println("Giriþ baþarýlý.");
	}
}
