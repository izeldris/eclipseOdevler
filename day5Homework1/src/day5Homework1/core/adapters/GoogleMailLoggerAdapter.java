package day5Homework1.core.adapters;

import day5Homework1.GoogleAuthenticator.GoogleMailLogin;

public class GoogleMailLoggerAdapter implements GoogleAuthService{

	@Override
	public void loginToSystem(String email, String password) {
		GoogleMailLogin gLogin=new GoogleMailLogin();
		gLogin.gMailLogin(email, password);
		
	}

}
