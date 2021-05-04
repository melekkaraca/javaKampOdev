package Odev3_4Gun.Adapters;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Odev3_4Gun.Abstract.CustomerCheckService;
import Odev3_4Gun.Entitites.Customer;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		int yas = 0;
		 LocalDateTime now = LocalDateTime.now();  
		 yas = now.getYear() - customer.getDateOfBrith().getYear();
		if(yas < 18) {
			return false;
		}else {
			return true;
		}
		}
}


