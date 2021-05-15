package day5Homework1.business.abstracts;

import java.util.List;

import day5Homework1.entities.concretes.User;

public interface LoginService {
	boolean login(User user, List<User> userList);
}
