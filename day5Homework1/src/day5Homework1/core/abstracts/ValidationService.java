package day5Homework1.core.abstracts;

import java.util.List;

import day5Homework1.entities.concretes.User;

public interface ValidationService {
	boolean emailCheck(User user);
	boolean isMailExists(User user,List<User> userList); 
	boolean isfirstNameCorrect(User user);
	boolean islastNameCorrect(User user);
	boolean isPasswordCorrect(User user);
}
