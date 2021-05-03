package Odev1_2Gun;

public class Main {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher(1,"Engin","Demiro�","","",true);
		
		Teacher teacher2 = new Teacher(2,"Melek", "Karaca","","",true);
		
		Teacher[] teachers = new Teacher[] {teacher1,teacher2};
		
		for (Teacher teacher : teachers) {
		System.out.println("Ad� Soyad�: "+ teacher.firstName + " " + teacher.lastName + " - Aktiflik: " + teacher.active);	
		}
		
		TeacherManager teacherManager = new TeacherManager();
		teacherManager.add(teacher2);
		teacher2.active=false;
		teacherManager.update(teacher2);
		
		Course course1 = new Course(1,"Yaz�l�mc� Geli�tirici Yeti�tirme Kamp�(C# + Angular",1,"",96,true);
		Course course2 = new Course(1,"Yaz�l�mc� Geli�tirici Yeti�tirme Kamp�(Java + React",2,"",96,true);
		
		Course[] courses = new Course[] {course1, course2};
		for (Course course : courses) {
			System.out.println("Kurs ad�: " + course.name + "-" + "Aktiflik: " + course.active);
		}
	}

}
