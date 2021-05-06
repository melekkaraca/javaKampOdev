package Gun4_Odev3.Concrete;

import Gun4_Odev3.Abstract.CustomerCheckService;
import Gun4_Odev3.Abstract.CustomerService;
import Gun4_Odev3.Entitites.Customer;


public class CustomerManager implements CustomerService{

	private CustomerCheckService _customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this._customerCheckService = customerCheckService;
	}
	@Override
	public void add(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer) == true)
		{
			System.out.println("Müþteri Kaydedildi: "+ customer.getFirstName());
		}else {
			System.out.println("Müþteri bilgisi doðrulanamadý: "+ customer.getFirstName());
		}
	}
	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri güncellendi: "+ customer.getFirstName());
		
	}
	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi: "+ customer.getFirstName());
		
	}

	

}
