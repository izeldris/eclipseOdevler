package day5Homework1.dataAccess.abstracts;

import java.util.List;

import day5Homework1.entities.concretes.User;

public interface UserDal {
	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getByMail(String email);
	List<User> getById(int id);
	List<User> getAll();
}
