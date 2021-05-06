package Gun3_Odev2;

public class InstructorManager extends UserManager {
	public void defineCourse(User user)
	{
		System.out.println(user.getFirstName() + "isimli öğretmene kurs tanımlandı.");
	}
}
