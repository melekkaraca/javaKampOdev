package Gun3_Odev2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Melek");
		student.setLastName("Karaca");
		student.setEmail("melekkaracaa@gmail.com");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setInstructorId(1);
		
		UserManager[] userManager = new UserManager[] {new StudentManager(), new InstructorManager()};
		userManager[0].add(student);
		userManager[1].add(instructor);
		StudentManager studentManager = new StudentManager();
		studentManager.buyCourse(student);
	}

}
