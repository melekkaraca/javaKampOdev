package Odev3_4Gun.Abstract;

import Odev3_4Gun.Entitites.Customer;


public abstract interface CustomerService{
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	
}
