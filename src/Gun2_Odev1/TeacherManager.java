package Gun2_Odev1;

public class TeacherManager {
	public void add(Teacher teacher){
		System.out.println( "��retmen eklendi: " + teacher.firstName + " " + teacher.lastName);
	}
	
	public void update(Teacher teacher){
		System.out.println( "��retmen g�ncellendi: " + teacher.firstName + " " + teacher.lastName);
	}
}
