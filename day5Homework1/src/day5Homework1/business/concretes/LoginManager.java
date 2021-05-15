package day5Homework1.business.concretes;

import java.util.List;

import day5Homework1.business.abstracts.LoginService;
import day5Homework1.entities.concretes.User;

public class LoginManager implements LoginService {

	@Override
	public boolean login(User user, List<User> userList) {
		for(User users:userList) {
			if(user.getEmail().equals(users.getEmail()) && user.getPassword().equals(users.getPassword())){
				return true;
			} 
		}
		return false;
	}

}
