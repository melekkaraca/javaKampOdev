package Odev2_4Gun.Concrete;

import Odev2_4Gun.Abcstract.CustomerCheckService;
import Odev2_4Gun.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	
	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
