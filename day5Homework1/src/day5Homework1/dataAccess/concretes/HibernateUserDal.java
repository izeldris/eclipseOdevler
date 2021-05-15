package day5Homework1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5Homework1.dataAccess.abstracts.UserDal;
import day5Homework1.entities.concretes.User;

public class HibernateUserDal implements UserDal {

	List<String> emailList = new ArrayList<String>();
	List<User> userList = new ArrayList<User>();

	@Override
	public void add(User user) {
		this.emailList.add(user.getEmail());
		this.userList.add(user);
		System.out.println("Kullanýcý sisteme eklendi. => " + user.getFirstName());

	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý bilgileri güncellendi. => " + user.getFirstName() + " " + user.getEmail());

	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý sistemden silindi => " + user.getId() + " " + user.getEmail());
	}

	@Override
	public List<User> getByMail(String email) {
		{
			for (String emails : emailList) {
				if (email == emails) {
					return this.userList;
					
				} else {
					System.out.println("Kullanýcý sistemde kayýtlý deðil.");
					
				}
			}
		}
		return userList;
		
	}

	@Override
	public List<User> getById(int id) {

		return null;
	}

	@Override
	public List<User> getAll() {

		return null;
	}

}
