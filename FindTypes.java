package week3.day2;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] chrarr = test.toCharArray();
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		int len = chrarr.length;
		
		for(int i=0;i<=len-1;i++) {
			if(Character.isLetter(chrarr[i])) {
				letter++;				
				continue;
			}else if(Character.isDigit(chrarr[i])) {
				num++;				
				continue;
			}else if(Character.isSpaceChar(chrarr[i])) {
				space++;				
				continue;
			}else {
				specialChar++;
				continue;
			}
		}
		System.out.println("Letters:" + " "+ letter);
		System.out.println("Numbers:"+ " "+ num);
		System.out.println("space"+" "+space);
		System.out.println("specialChar"+" "+specialChar);
	}

}
