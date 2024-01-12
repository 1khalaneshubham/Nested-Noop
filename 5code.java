






/*
 *
Q.5
 WAP to print the following pattern

 Row = 4;

  0  
  1  1 
  2  3  5
  8  13  21  34  

  USE THIS FOR LOOP STRICRLY for the outer loop 
  For(int i = 1; i <= row; i++){

  }

*/

import java.io.*;
class Demo{

	public static void main(String...oky)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter NO. of Rows: ");

		int row = Integer.parseInt(br.readLine());

		int a = 0;
	        int b = 1;

		for(int i = 1; i <= row; i++){

			for(int j = 1; j <= i; j++){

				System.out.print(a+"  ");

				int c = a + b;
				a = b; 
				b = c;

			}

			System.out.println();

		}
	}
}


