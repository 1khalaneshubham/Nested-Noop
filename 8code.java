/* 
 * Q.8
 * Write a program to print the following patterb
 *  Row = 8
 *
 *  $
 *  @@
 *  &&&
 *  ####
 *  $$$$$
 *  @@@@@@
 *  &&&&&&&
 *  ########
 *
 *  use the for loop strictly for loop outer loop
 *  int row; 
 *  take row form user
 *  for(int i = 1; i <=; i++){
 *  }
 */


import java.io.*;
class Demo{
	public static void main(String args[])throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no.of rows:");
		int row = Integer.parseInt(br.readLine());


		for(int i = 1; i <= row; i++){
		for(int j = 1; j <= i; j++){
			if(i%4==1)
				System.out.print("$");
			else if(i%4==2)
				System.out.print("@");
			else if(i%4 == 3)
				System.out.print("&");
			else
				System.out.print("#");
		}
		System.out.println();
	}
	
	}

}
