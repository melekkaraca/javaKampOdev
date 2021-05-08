package Gun5_Odev1.dataAccess.abstracts;

import java.util.List;
import Gun5_Odev1.entities.concretes.User;

public interface UserDao {
	void add(User product);
	void update(User product);
	void delete(User product);
	User get(int id);
	List<User> getAll();
}
