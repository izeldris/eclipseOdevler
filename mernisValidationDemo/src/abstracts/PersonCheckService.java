package abstracts;

import entities.Customer;

public interface PersonCheckService {
	boolean checkIfARealPerson(Customer customer) throws Exception;

}
