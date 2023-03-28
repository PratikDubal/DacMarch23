import java.util.*;
class Que13Reverse
{
	public static void main(String args[])

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number..");
		
		int num= sc.nextInt();
		int temp=num;
		int count=0;
		int reverse=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		while(temp>0)
		{
			 reverse =temp%10;
			 System.out.print(reverse+"");
			temp=temp/10;
			
			count--;
			
		}
		System.out.print("is reverse number..");
	}	
	
}