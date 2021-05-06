package Gun2_Odev1;

public class TeacherManager {
	public void add(Teacher teacher){
		System.out.println( "Öðretmen eklendi: " + teacher.firstName + " " + teacher.lastName);
	}
	
	public void update(Teacher teacher){
		System.out.println( "Öðretmen güncellendi: " + teacher.firstName + " " + teacher.lastName);
	}
}
