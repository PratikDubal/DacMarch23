import java.util.*;

class Que19Even
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the range..");
		
	int range= sc.nextInt();
	    
		for (int i=1;i<=range;i++)
		{
			if (i%2==0)
				System.out.print("  "+i);
		}
        
        		
	}
}