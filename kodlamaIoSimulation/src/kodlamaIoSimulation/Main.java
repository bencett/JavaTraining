package kodlamaIoSimulation;

public class Main {

	public static void main(String[] args) {
		
		User student = new Student();
		student.setUserFirstName("�etin");
		student.setUserLastName("�r�n");
		student.setUserPassword("Studentpassword");
		
		System.out.println(student.getUserLastName());

	}

}
