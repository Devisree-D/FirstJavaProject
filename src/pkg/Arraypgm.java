package pkg;

import java.util.Scanner;

public class Arraypgm {

	public static void main(String[] args) {
		int[]ar=new int[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter number:");
			ar[i]=sc.nextInt();
		}

System.out.println("Entered numbers: ");
		
		for(int i=0;i<4;i++)
		{
			
			System.out.println(ar[i]);
		}
	}

}
