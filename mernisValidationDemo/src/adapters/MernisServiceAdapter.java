package adapters;

import abstracts.PersonCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements PersonCheckService{

	@Override
	public boolean checkIfARealPerson(Customer customer) throws Exception {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
	}

}
