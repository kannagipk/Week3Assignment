package week3.day2;

public class College extends University{

	public static void main(String[] args) {
		College clg = new College();
		clg.pg();
		clg.ug();

	}

	@Override
	public void ug() {
		System.out.println("Information Technology");
		
	}

}
