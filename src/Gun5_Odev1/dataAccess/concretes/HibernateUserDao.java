package Gun5_Odev1.dataAccess.concretes;

import java.util.List;

import Gun5_Odev1.dataAccess.abstracts.UserDao;
import Gun5_Odev1.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi: " + user.getFirstName() + " " + user.getLastName());
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

}
