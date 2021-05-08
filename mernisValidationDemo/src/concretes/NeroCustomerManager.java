package concretes;

import abstracts.BaseCustomerManager;
import abstracts.PersonCheckService;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	private PersonCheckService personCheckService;

	public NeroCustomerManager(PersonCheckService personCheckService) {
		this.personCheckService= personCheckService;
	}

@Override
public void save(Customer customer) throws Exception {
	if(personCheckService.checkIfARealPerson(customer)) {
	super.save(customer);
	}else {
		System.out.println("Not a valid person");
	}
	
}
}
