package Odev2_3Gun;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý eklendi: "+ user.getFirstName() + " " +user.getLastName());
	}
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi: "+ user.getFirstName() + " " +user.getLastName());
	}
	public void delete(User user) {
		System.out.println("Kullanýcý silindi: "+ user.getFirstName() + " " +user.getLastName());
	}
	
}
