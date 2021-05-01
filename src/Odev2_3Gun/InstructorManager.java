package Odev2_3Gun;

public class InstructorManager extends UserManager {
	public void defineCourse(User user)
	{
		System.out.println(user.getFirstName() + "isimli öğretmene kurs tanımlandı.");
	}
}
