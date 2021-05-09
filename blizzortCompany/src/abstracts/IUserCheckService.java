package abstracts;

import entities.User;

public interface IUserCheckService {
	boolean checkIfARealPerson(User user) throws Exception;

}
