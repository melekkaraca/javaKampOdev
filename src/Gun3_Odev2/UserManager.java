package Gun3_Odev2;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� eklendi: "+ user.getFirstName() + " " +user.getLastName());
	}
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi: "+ user.getFirstName() + " " +user.getLastName());
	}
	public void delete(User user) {
		System.out.println("Kullan�c� silindi: "+ user.getFirstName() + " " +user.getLastName());
	}
	
}
