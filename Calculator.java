package week3.day1;

public class Calculator {
	public void add(int a, int b) {
		System.out.println(a+b);

	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void multiply(int a,int b) {
		System.out.println(a*b);

	}
	public void multiply(int a, double b) {
		System.out.println(a*b);

	}
	public void subtract(int a , int b) {
		System.out.println(a-b);

	}
	public void subtract(double a , double b) {
		System.out.println(a-b);

	}
	public void divide(int a, int b) {
		// TODO Auto-generated method stub

	}
	public void divide(int a,double b) {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Calculator calc= new Calculator();
		calc.add(4, 6);
		calc.add(6, 1, 4);
		calc.multiply(2, 9.5);
		calc.multiply(6, 9);
		calc.subtract(45.6, 24.6);
		calc.subtract(6, 7);
		calc.divide(45, 8.8);
		calc.divide(67, 8);
	}
}
