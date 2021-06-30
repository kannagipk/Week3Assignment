package week3.day2;

public class Desktop implements HardWare,Software{
	public void desktopModel() {
		System.out.println("Dell Inspiron");

	}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.desktopModel();
		desk.hardwareResources();
		desk.softwareResources();

	}
	public void softwareResources() {
		System.out.println("Here are the Software resourced");
		
	}
	public void hardwareResources() {
		System.out.println("Here is the hardware resources");
		
	}

}
