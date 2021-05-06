package Gun4_Odev2;

import java.time.LocalDate;

import Gun4_Odev2.Abcstract.BaseCustomerManager;
import Gun4_Odev2.Adapters.MernisServiceAdapter;
import Gun4_Odev2.Concrete.NeroCustomerManager;
import Gun4_Odev2.Concrete.StarbucksCustomerManager;
import Gun4_Odev2.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Melek");
		customer.setLastName("Karaca");
		customer.setNationalityId(Long.valueOf("12345678910"));
		customer.setDateOfBrith(LocalDate.of(1988,04,23));
		
		customerManager.Save(customer);
	}

}
