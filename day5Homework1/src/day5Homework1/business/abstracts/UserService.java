package day5Homework1.business.abstracts;

import day5Homework1.entities.concretes.User;
import java.util.List;

public interface UserService {
	void register(User user, List<User> userList);
	void delete(User user);
	void update(User user);
	void sendVerifyEmail();

}
