package pkg;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		Primeno ob=new Primeno();
		ob.prime( a);
		
	}
public void prime(int a)
{
	
	boolean prime=true;
	if(a<=1)
	{
		prime=false;
		
	}
	
	else
	{
		
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				prime=false;
				break;
			}
		}
	}
	if(prime)
	{
		System.out.println(a+ "is prime");
		
		
	}
	else
		
	{
		System.out.println(a+ "is not prime");
	}
}
}
