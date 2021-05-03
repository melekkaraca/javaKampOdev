package Odev2_4Gun.Adapters;

import java.rmi.RemoteException;

import MernisServiceReference.*;
import Odev2_4Gun.Abcstract.CustomerCheckService;
import Odev2_4Gun.Entities.Customer;

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


