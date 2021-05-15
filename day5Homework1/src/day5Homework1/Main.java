package day5Homework1;

import java.util.ArrayList;
import java.util.List;

import day5Homework1.business.concretes.LoginManager;
import day5Homework1.business.concretes.UserManager;
import day5Homework1.core.adapters.GoogleMailLoggerAdapter;
import day5Homework1.core.concretes.ValidationManager;
import day5Homework1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "1234567890", "Harun Emre", "Altun", "harunemrealtun@gmail.com", "12345678ss");
		User user2 = new User(2, "0987654321", "Nihat Can", "Akýn", "nihatcanakin@gmail.com", "135tamam");
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);

		UserManager userManager = new UserManager(new ValidationManager(), new GoogleMailLoggerAdapter());
		userManager.register(user1, userList);
		userManager.register(user2, userList);
		
		LoginManager loginManager=new LoginManager();
		boolean isLogin=loginManager.login(user2, userList);
		if(isLogin) {
			System.out.println("Giriþ Baþarýlý");
		}else {
			System.out.println("Giriþ Bilgilerinizi Kontrol Ediniz.");
		}
	}

}
