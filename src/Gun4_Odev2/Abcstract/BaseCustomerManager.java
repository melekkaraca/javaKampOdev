package Gun4_Odev2.Abcstract;

import Gun4_Odev2.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public  void Save(Customer customer) {
		System.out.println("Database'e kaydedildi: "+ customer.getFirstName());
		
	}

}
