





/*
Q.4

 WAP to print all even numbers in reverse order and odd numbes in the standard way.
 Both separately.within a range. Tkae the start and end form usre.

 Input: Enter start number - 2
        Enter End number - 9

Output: 8 6 4 2
        3 5 7 9

*/

import java.io.*;
class Demo{

	public static void main(String...oky)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Start and End of range:  ");

		int start = Integer.parseInt(br.readLine());

		int end = Integer.parseInt(br.readLine());

		System.out.print("Even Number: ");

		for(int i = end; i >= start ; i--){

			if(i % 2 == 0)

				System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Odd Number: ");

		for(int i = start; i <= end; i++){

			if(i % 2 == 1){

				System.out.print(i+" ");

			}
		}
		System.out.println();
	}

}







