package concretes;

import abstracts.IPersonService;
import abstracts.IUserCheckService;
import entities.User;

public class PersonManager implements IPersonService {
	private IUserCheckService userCheckService;

	public PersonManager(IUserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) throws Exception {
		if(userCheckService.checkIfARealPerson(user)) {
			System.out.println(
					"Kullan�c� Sisteme Ba�ar� �le Kaydedildi." + user.getFirstName() + " " + user.getLastName());
		} else {
			System.out.println("L�tfen Ger�ek Bilgilerinizi Giriniz");
		}
	}

	@Override
	public void update(User user) {
		System.out.println(
				"Kullan�c� Bilgileri Ba�ar� �le G�ncellendi." + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� Bilgileri Sistemden Kald�r�d�." + user.getFirstName() + " " + user.getLastName());

	}

}
