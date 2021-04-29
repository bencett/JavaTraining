package kodlamaIoSimulation;

public class Student extends User{
	private final int studentId;
	private String studentCourseDetail;
	
	public Student(int studentId,String studentCourseDetail) {
		super();
		this.studentId=studentId;
		this.studentCourseDetail=studentCourseDetail;
	}

	public Student() {
		this.studentId = 0;
		// TODO Auto-generated constructor stub
	}

	public String getStudentCourseDetail() {
		return studentCourseDetail;
	}

	public void setStudentCourseDetail(String studentCourseDetail) {
		this.studentCourseDetail = studentCourseDetail;
	}

	public int getStudentId() {
		return studentId;
	}
}
