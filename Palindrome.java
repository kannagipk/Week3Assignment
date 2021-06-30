package week1.day2;

public class Palindrome {
	//Build a logic to find the given string is palindrome or not
    
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
	public static void main(String[] args) {
		String title ="madam";
		String rev ="";
		int length = title.length();
		for(int i = length-1;i>=0;i--) 
		{
			rev = rev+title.charAt(i);
		}
		if(title.equals(rev)) 
		{
			System.out.println("Title Madam is Palindrome");
		}else
		{
			System.out.println("Title Madam is not a Palindrome");
		}
		}

	}


