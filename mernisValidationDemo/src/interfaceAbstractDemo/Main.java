package interfaceAbstractDemo;

import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
	
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		
		Customer customer1 = new Customer();
		
		
		customer1.setId(1);
		customer1.setFirstName("Harun Emre");
		customer1.setLastName("Altun");
		customer1.setDateOfBirth(LocalDate.of(1995, 8, 28));
		customer1.setNationalityId("25070415004");
		
		
		customerManager.save(customer1);
		
		

	}

}
