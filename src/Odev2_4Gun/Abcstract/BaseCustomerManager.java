package Odev2_4Gun.Abcstract;

import Odev2_4Gun.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public  void Save(Customer customer) {
		System.out.println("Database'e kaydedildi: "+ customer.getFirstName());
		
	}

}
