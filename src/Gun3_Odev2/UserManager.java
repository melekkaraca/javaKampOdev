package Gun3_Odev2;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanıcı eklendi: "+ user.getFirstName() + " " +user.getLastName());
	}
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi: "+ user.getFirstName() + " " +user.getLastName());
	}
	public void delete(User user) {
		System.out.println("Kullanıcı silindi: "+ user.getFirstName() + " " +user.getLastName());
	}
	
}
