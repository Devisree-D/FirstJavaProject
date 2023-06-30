package pkg;

public class Armstrongpgm {

	public static void main(String[] args) {
		int n=371;
		int l=String.valueOf(n).length();
		int r;
		int temp=n;
		int s=0;
		while(n>0)

		{
			r=n%10;
			//s=s+Math.pow(n, l);
			s=s+r*r*r;
			n=n/10;
		}
		
		
		if(s==temp)
		{
			
			System.out.println("Armstromg");
		}
		
		else
			
		{
			System.out.println("Not Armstrong");
		}
	}
	
	

}
