import java.util.*;
class Que11Smallest
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter three number...");
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	if (a<b && a<c)
	
		System.out.println(a+"is the smallest..");
		
	else if (b<a && b<c)
		System.out.println(b+"is the smallest..");
	
	else
		System.out.println(c+"is the smallest..");
	
}


}