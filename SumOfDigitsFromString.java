package week3.day2;

public class SumOfDigitsFromString {
	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		String replace = text.replaceAll("[a-zA-Z]", "");
		//System.out.println(replace);
		char[] numbers = replace.toCharArray();
		int len = numbers.length;
		int sum = 0;
		
		for(int i=0;i<=len-1;i++) {
			//System.out.println(Character.getNumericValue(numbers[i]));
			
			sum =sum+Character.getNumericValue(numbers[i]);
			
		}
		
		System.out.println(sum);
	}
}
