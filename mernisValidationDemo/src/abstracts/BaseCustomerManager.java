package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	@Override
	public void save(Customer customer) throws Exception {
 
		System.out.println("Veritabanýna Kaydedildi => " + customer.getFirstName());
	}
}
