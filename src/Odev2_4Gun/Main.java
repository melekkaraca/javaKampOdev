package Odev2_4Gun;

import java.time.LocalDate;

import Odev2_4Gun.Abcstract.BaseCustomerManager;
import Odev2_4Gun.Adapters.MernisServiceAdapter;
import Odev2_4Gun.Concrete.NeroCustomerManager;
import Odev2_4Gun.Concrete.StarbucksCustomerManager;
import Odev2_4Gun.Entities.Customer;

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
