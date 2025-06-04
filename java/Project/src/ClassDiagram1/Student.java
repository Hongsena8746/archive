package ClassDiagram1;
import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	private String name;
	private ArrayList<Transcript> transcripts;
	
	public Student(String name) {
		this.name = name;
		this.transcripts = new ArrayList<Transcript>();
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	public ArrayList<Transcript>getTranscripts(){
		return transcripts;
	}
	
	//이부분... 학생이 수강한 과목을 목록을 반환시켜야한다.
	public ArrayList<Course> getCourses() {
		ArrayList<Course> courses = new ArrayList<>();
		for(Transcript tran : transcripts) {
			courses.add(tran.getCourse());
		}
		return courses;
	}
	
	public String getName() {
		return name;
	}
	
	

}
