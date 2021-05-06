package Gun4_Odev2.Concrete;

import Gun4_Odev2.Abcstract.CustomerCheckService;
import Gun4_Odev2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	
	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
