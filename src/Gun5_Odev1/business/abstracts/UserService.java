package Gun5_Odev1.business.abstracts;

import java.util.List;

import Gun5_Odev1.entities.concretes.User;
import Gun5_Odev1.entities.dtos.UserForRegisterDto;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
	void checkUserEmail(User user);
	void sendUserActivationMail(User user);
}
