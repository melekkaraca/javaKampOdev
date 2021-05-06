package Gun4_Odev3.Adapters;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Gun4_Odev3.Abstract.CustomerCheckService;
import Gun4_Odev3.Entitites.Customer;

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


