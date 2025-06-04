package ClassDiagram;
import java.util.Vector;

public class Student {
	private String name;
	private Vector<Course> courses;
	
	public Student(String name) {
		this.name = name;
		courses = new Vector<Course> ();
	}
	
	
	public void registerCourse(Course course) {
		courses.add(course);
		course.addStudent(this);
	}
	
	public void dropCource(Course course) {
		if(courses.contains(course)) {
			courses.remove(course);
			course.removeStudent(this);
		}
	}
	
	public Vector<Course> getCourse(){
		return courses;
	}
}
