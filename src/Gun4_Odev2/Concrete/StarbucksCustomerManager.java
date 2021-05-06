package Gun4_Odev2.Concrete;

import Gun4_Odev2.Abcstract.BaseCustomerManager;
import Gun4_Odev2.Abcstract.CustomerCheckService;
import Gun4_Odev2.Entities.Customer;

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
