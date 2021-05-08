package Gun5_Odev1.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Gun5_Odev1.business.abstracts.AuthService;
import Gun5_Odev1.business.abstracts.UserService;
import Gun5_Odev1.entities.concretes.User;
import Gun5_Odev1.entities.dtos.UserForRegisterDto;

public class AuthManager implements AuthService{
	UserService _userService;
	
	public AuthManager(UserService _userService) {
		super();
		this._userService = _userService;
	}

	@Override
	public void Register(UserForRegisterDto userDto) {
		if(validateEmail(userDto.getEmail()) == true) {
			if(userDto.getFirstName() == null || userDto.getLastName() == null || userDto.getEmail() == null || userDto.getPassword() == null) {
				System.out.println("Tüm verileri doldurduðunuzdan emin olunuz.");
				return;
			}else {
				
				List<User> users =_userService.getAll();
				
				if(users.contains(userDto.getEmail()) == true) {
					System.out.println("Kullanýcý adý zaten kayýtlý.");
					return;
				}
				if(userDto.getFirstName().length() < 2 || userDto.getLastName().length() < 2) {
					System.out.println();
					return;	
				}
				if(userDto.getPassword().length()<6){
					System.out.println("Parola 6 karakterden az olamaz.");
					return;
				}
				User user = new User(1,userDto.getFirstName(),userDto.getLastName(),userDto.getEmail(),userDto.getPassword(),0,true);
				_userService.add(user);
			}
		}else {
			System.out.println("Email doðrulanamadý");
			return;
		}
				
	}

	@Override
	public void Login(UserForRegisterDto userDto) {
		User user = _userService.get(1); 
		if(userDto.getEmail() == null || userDto.getPassword() == null) {
			System.out.println("Kullanýcý adý/parola boþ býrakýlamaz");
		}else if(userDto.getEmail() == user.getEmail() && userDto.getPassword() == user.getPassword()) {
			System.out.println("Giriþ baþarýlý");
		}else{
			System.out.println("Giriþ baþarýsýz.");
		}
	}

	@Override
	public void Logout(UserForRegisterDto user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkUserEmail(UserForRegisterDto userDto) {
		User user = _userService.get(1);
		_userService.checkUserEmail(user);
		
	}
	public Boolean validateEmail(String email) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();		
	}

}
