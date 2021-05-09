package adapters;

import abstracts.IUserCheckService;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class GovServiceAdapter implements IUserCheckService{

	@Override
	public boolean checkIfARealPerson(User user) throws Exception {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalId()), user.getFirstName(), 
				user.getLastName(),user.getDateOfBirth().getYear());
		
	}

}
