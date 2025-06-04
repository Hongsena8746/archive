package ClassDiagram1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import ClassDiagram.Student;

public class Course {
    private String name;
    private ArrayList<Transcript> transcripts;
	
	public Course(String name) {
		this.name = name;
		this.transcripts = new ArrayList<>();
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	public ArrayList<Transcript>getTranscripts(){
		return transcripts;
	}
	

	public String getName() {
		return name;
	}
}
