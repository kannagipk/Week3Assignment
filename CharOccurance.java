package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count =0;
		char[] chrarr = str.toCharArray();
		
		for(int i=0;i<=chrarr.length-1;i++) {
			if(chrarr[i] == 'e') {
				count = count +1;
			}
		}System.out.println(count+ " "+"is the count of letter e");

	}

}
