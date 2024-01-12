



/*
Take all the input from the user use bufferedReader

Q.1

Write a program to print the following pattern 

   D4 C3 B2 A1
   A1 B2 C3 D4
   D4 C3 B2 A1
   A1 B2 C3 D4

   USE this for loop strictly for the outer loop int row;
    Take the number of rows from user 
    for(int i = 0; i <= row; i++){

    }
*/

import java.io.*;
class Demo{

	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Rows:");

		int rows = Integer.parseInt(br.readLine());
		int num = rows;
		int ch = rows+64;


		for(int i = 1; i <= rows; i++){

			for(int j = 1; j <= rows; j++){

				if(i%2==1){
                                  
					System.out.print(num--+"  "+(char)ch--+"  ");

				}
				else{
					System.out.print(num++ +"  "+(char)ch++ +"  ");

				}

			}

			if(i%2==1){

				num++;
				ch++;
			}else{

				num--;
				ch--;

			}

			System.out.println();

		}
	}
}



