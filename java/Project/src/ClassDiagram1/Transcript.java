package ClassDiagram1;
import java.util.ArrayList;
import java.util.Iterator;

public class Transcript {
	private Student student;
	private Course course;
	private int date;
	private String grade;
	
	
	public Transcript(Student student, Course course) {
		this.student = student;
		this.course = course;
		
		student.addTranscript(this);
		course.addTranscript(this);    //연관된거 등록하고
	}
	
	public Student getStudent() {
		return student;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	public int getDate() {
		return date;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}

}
