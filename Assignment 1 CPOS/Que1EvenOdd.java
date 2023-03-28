import java.util.*;
class Que1EvenOdd
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number..");
		int i = sc.nextInt();
		if (i%2==0)
			System.out.println("number is even");
		else 
			System.out.println("number is odd");
		
	}
}