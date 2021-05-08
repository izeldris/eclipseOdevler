package concretes;

import abstracts.PersonCheckService;
import entities.Customer;

public class PersonCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfARealPerson(Customer customer) throws Exception {
		return true;
		
	}

}
