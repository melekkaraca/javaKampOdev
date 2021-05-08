package Gun5_Odev1.business.concretes;

import java.util.List;
import Gun5_Odev1.business.abstracts.UserService;
import Gun5_Odev1.entities.concretes.User;
import Gun5_Odev1.entities.dtos.UserForRegisterDto;

public class LoginManager implements UserService{

	@Override
	public void add(User user) {
		//Todo: ekleme i�lemleri
		System.out.println("Kulan�c� eklendi. Eposta adresinize aktivasyon maili g�nderilmi�tir." + user.getFirstName());
		sendUserActivationMail(user);
	}

	@Override
	public void update(User user) {
		System.out.println("Kulan�c� g�ncellendi." + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kulan�c� eklendi." + user.getFirstName());
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkUserEmail(User user) {
		user.setStatusId(1);
		update(user);
		
	}

	@Override
	public void sendUserActivationMail(User user) {
		System.out.println("Aktivasyon maili g�nder");
	}

}
