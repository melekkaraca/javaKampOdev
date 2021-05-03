package Odev2_4Gun.Concrete;

import Odev2_4Gun.Abcstract.BaseCustomerManager;
import Odev2_4Gun.Abcstract.CustomerCheckService;
import Odev2_4Gun.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
    private CustomerCheckService _customerCheckService;

   
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this._customerCheckService = customerCheckService;
	}


	@Override
	public  void Save(Customer customer) {
		
		if(_customerCheckService.CheckIfRealPerson(customer) == true)
		{
			this.Save(customer);
			System.out.println("Database'e kaydedildi: "+ customer.getFirstName());
		}
		else {
			System.out.println("Kullanýcý geçersiz.");
		}
		
		
	}
	
}
