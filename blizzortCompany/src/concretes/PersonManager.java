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
					"Kullanýcý Sisteme Baþarý Ýle Kaydedildi." + user.getFirstName() + " " + user.getLastName());
		} else {
			System.out.println("Lütfen Gerçek Bilgilerinizi Giriniz");
		}
	}

	@Override
	public void update(User user) {
		System.out.println(
				"Kullanýcý Bilgileri Baþarý Ýle Güncellendi." + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý Bilgileri Sistemden Kaldýrýdý." + user.getFirstName() + " " + user.getLastName());

	}

}
