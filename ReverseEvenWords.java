package week3.day2;

public class ReverseEvenWords {
	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

	/* Pseudo Code:
	 
	 * Declare the input as Follow
      		String test = "I am a software tester"; 
      		
	a) split the words and have it in an array
	b) Traverse through each word (using loop)
	c) find the odd index within the loop (use mod operator)
	
	d)split the words and have it in an array
	
	e)print the even position words in reverse order using another loop (nested loop)
	f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
	
	 
*/
	public static void main(String[] args) {
		
	String test = "I am a software tester";
	String[] split1 = test.split(" ");
	int length = split1.length;
	String reversedString="";
	for(int i = 1;i<length;i++) {
		//System.out.println(split1[i]);
		if(i%2 == 0) {
			String chr = split1[i];
			//System.out.println(chr);
			String reversewrd = "";
			for(int j=chr.length()-1;j>=0;j--) {
				reversewrd = reversewrd + chr.charAt(j);
			   }
			   reversedString = reversedString + reversewrd + " ";
			}
			
		}
	System.out.println(test);
	System.out.println(reversedString);

	}
	}

