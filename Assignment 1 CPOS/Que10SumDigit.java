import java.util.*;
class Que10SumDigit
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int num = sc.nextInt();
		int temp=num;
		int count=0;
		int sum=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;	
		}
		
		while(temp>0)
		{
			int digit=temp%10;
			temp=temp/10;
			count--;
		     
			sum = sum+digit;
	    }
	System.out.println("sum is"+sum);
	
	}
	
}