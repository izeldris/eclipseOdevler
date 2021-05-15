package day5Homework1.core.concretes;

import java.util.List;
import java.util.regex.*;

import day5Homework1.core.abstracts.ValidationService;
import day5Homework1.entities.concretes.User;

public class ValidationManager implements ValidationService {

	@Override
	public boolean emailCheck(User user) {
		String regex = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}(.[a-z]{2,3})+$|^$";
		Matcher matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(user.getEmail());
		if (matcher.matches()) {
			return true;
		} else {
			System.out.println("Lütfen mail adresinizi kontrol ediniz.");
			return false;
		}
	}

	@Override
	public boolean isMailExists(User user, List<User> userList) {
		if (userList.size() == 0) {
			return true;
		} else {
			for (User users : userList) {
				if (users.getEmail() == user.getEmail()) {
					System.out.println("Bu mail adresi zaten kayýtlý.");
					return false;
				}

			}
		}
		return true;
	}

	@Override
	public boolean isfirstNameCorrect(User user) {
		if (user.getFirstName().length() <= 2) {
			System.out.println("Ýsim en az 2 karakter olmalýdýr.");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean islastNameCorrect(User user) {
		if (user.getLastName().length() <= 2) {
			System.out.println("Soyisim en az 2 karakter olmalýdýr.");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean isPasswordCorrect(User user) {
		if (user.getPassword().length() <5) {
			System.out.println("Parola en az 6 karakter olmalýdýr.");
			return false;
		} else {
			return true;
		}
		
	}

}
