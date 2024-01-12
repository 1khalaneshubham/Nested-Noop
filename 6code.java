/*
 Write a program ,and take two charaters if these characters are equal then print them as it is but if they are unequal then print their difference (Note: Consider positoinal difference Not ASIIs )
INPUT: a p
output: The difference between a and p is 15

*/

import java.io.*;
class Demo{                                                          // class
	public static void main(String args[])throws IOException{           
								    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two Characters:");		
		char ch1 = (char)br.read();
		br.skip(1);
		char ch2 = (char)br.read();
		
		if(ch1 == ch2)
			System.out.println("The two characters are same :");
		else{
			int diff = ch1 - ch2;
			if(diff < 0 ){
				diff = diff*(-1);
			}
			System.out.println("The Difference b/w " +ch1+ " and " +ch2+ " charaters is " +diff);
		}
	}
}



