package Gun3_Odev2;

public class StudentManager extends UserManager{
	public void buyCourse(User user) {
		System.out.println(user.getFirstName() + " kullanıcısı bir kurs satın alındı.");
	}
}
