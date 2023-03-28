import java.util.*;

class Star14
{
	public static void main(String args[])
	{
		for(int i =5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				if(j>i)
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =2;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				if(j>i)
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*

*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********

*/