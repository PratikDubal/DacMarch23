import java.util.*;
class Que5PosNeg
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number..");
		int i = sc.nextInt();
		if (i>0)
			System.out.println("number is positive");
		else if(i<0){
			
			System.out.println("number is negative");
		}
		else{
			System.out.println("number is not negative or positive..");
		}
	}
}