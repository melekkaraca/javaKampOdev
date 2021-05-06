package Gun2_Odev1;

public class Course {
	
	public Course() {
		
	}
	public Course(int id, String name, int teacherId, String imageUrl,double completion, Boolean active) {
		this();
		this.id=id;
		this.teacherId = teacherId;
		this.name=name;
		this.imageUrl = imageUrl;
		this.completion=completion;
		this.active=active;
	}
	public int id;
	public int teacherId;
	public String name;
	public String imageUrl;
	public double completion;
	public Boolean active;
}
