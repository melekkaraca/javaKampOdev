package Gun4_Odev2.Adapters;

import java.rmi.RemoteException;

import Gun4_Odev2.Abcstract.CustomerCheckService;
import Gun4_Odev2.Entities.Customer;
import MernisServiceReference.*;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		 KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
		boolean deneme = false;
		
		try {
			   deneme = kpsPublicSoap.TCKimlikNoDogrula(
					   customer.getNationalityId(),
					   customer.getFirstName(),
					   customer.getLastName(),
					   customer.getDateOfBrith().getYear()
					    );
					  } catch (NumberFormatException e) {
					   e.printStackTrace();
					  } catch (RemoteException e) {
					   e.printStackTrace();
					  }
					  if (deneme == true) {
					   System.out.println(String.valueOf("Tc doðrudur"));
					  } else {
					   System.out.println("Tc yanlýþ");
					  }
					  return deneme;
		
		}
}


