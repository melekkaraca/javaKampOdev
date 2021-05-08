package Gun5_Odev1.business.abstracts;

import Gun5_Odev1.entities.concretes.User;
import Gun5_Odev1.entities.dtos.UserForRegisterDto;

public interface AuthService {
	void Register(UserForRegisterDto user);
	void Login(UserForRegisterDto user);
	void Logout(UserForRegisterDto user);
	void checkUserEmail(UserForRegisterDto user);
}
