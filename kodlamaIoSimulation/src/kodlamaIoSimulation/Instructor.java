package kodlamaIoSimulation;

public class Instructor extends User{
	private final int instructorId;
	private String course;
	
	public Instructor(int instructorId,String course) {
		super();
		this.instructorId=instructorId;
		this.course=course;
		
	}
	

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getInstructorId() {
		return instructorId;
	}
}
