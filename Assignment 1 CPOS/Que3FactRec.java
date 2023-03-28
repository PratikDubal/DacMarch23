import java.util.*;
class Que3FactRec
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		
		int num= sc.nextInt();
		int fact=1;
		fact=factorial(num);
		System.out.println("factorial of number is"+fact);
	}
	
	public static int factorial(int number)
	{
		if (number==0)
		 return 1;
	    else
			return(number*factorial(number-1));
			
		
	}
}
