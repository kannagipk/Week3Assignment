package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student Id is"+" "+id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id is"+" "+id);
		System.out.println("Student Name is"+" "+name);

	}
	public void getStudentInfo(String email,String phone) {
		System.out.println("Student email is"+" "+email);
		System.out.println("Student phone is"+" "+phone);
	}
	public static void main(String[] args) {
		Students student = new Students();
		student.getStudentInfo(42565);
		student.getStudentInfo(5655, "Kannagi P K");
		student.getStudentInfo("kannagipk@gmail.com", "4257567567878");
	}
}
