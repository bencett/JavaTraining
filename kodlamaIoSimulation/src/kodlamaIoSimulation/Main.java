package kodlamaIoSimulation;

public class Main {

	public static void main(String[] args) {
		
		User student = new Student();
		student.setUserFirstName("Çetin");
		student.setUserLastName("Ürün");
		student.setUserPassword("Studentpassword");
		
		System.out.println(student.getUserLastName());

	}

}
