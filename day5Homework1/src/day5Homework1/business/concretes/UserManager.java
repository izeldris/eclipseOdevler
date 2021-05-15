package day5Homework1.business.concretes;

import java.util.List;

import day5Homework1.business.abstracts.UserService;
import day5Homework1.core.abstracts.ValidationService;
import day5Homework1.core.adapters.GoogleAuthService;
import day5Homework1.entities.concretes.User;

public class UserManager implements UserService {

	private ValidationService validationService;
	private GoogleAuthService googleAuthService;

	public UserManager(ValidationService validationService, GoogleAuthService googleAuthService) {
		this.validationService = validationService;
		this.googleAuthService = googleAuthService;
	}

	@Override
	public void register(User user, List<User> userList) {
		if (validationService.isfirstNameCorrect(user) && 
				validationService.islastNameCorrect(user) && 
				validationService.emailCheck(user) && 
				validationService.isMailExists(user, userList) && 
				validationService.isPasswordCorrect(user))
				{ return;
		}
		
		System.out.println("Kayýt Baþarýlý.");
		}

	@Override
	public void delete(User user) {
		
	}

	@Override
	public void update(User user) {

	}

	@Override
	public void sendVerifyEmail() {
		System.out.println("Lütfen mailinize gönderilen doðrulama E-Postasýný kontrol ediniz.");
	}

}
