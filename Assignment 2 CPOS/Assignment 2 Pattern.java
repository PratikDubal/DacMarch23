class Pattern1
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/



class Pattern2
{
	public static void main(String args[])
	{
		int alpha=64;
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
	}
}
/*
A
A B
A B C
A B C D
A B C D E
*/




class Pattern5
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	
}

/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/




class Pattern7
{
	public static void main(String args[])
	{
		for(int i =1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
		
			System.out.println();
		}
	}
	
}

/*
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5
 
 */




class Pattern8
{
	public static void main(String args[])
	{
		for(int i =5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(k+" ");
			}
		
			System.out.println();
		}
	}
	
}

/*

     5
    4 5
   3 4 5
  2 3 4 5
 1 2 3 4 5
 
 */




class Pattern9
{
	public static void main(String args[])
	{
		
		int alpha=64;
		
		for(int i =1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)(alpha+k)+" ");
			}
		
			System.out.println();
		}
	}
	
}

/*

     A
    A B
   A B C
  A B C D
 A B C D E
 
 */






class Pattern10
{
	public static void main(String args[])
	{
		
		int alpha=64;
		
		for(int i =5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print((char)(alpha+k)+" ");
			}
		
			System.out.println();
		}
	}
	
}

/*

     E
    D E
   C D E
  B C D E
 A B C D E
 
 */





class Pattern12
{
	public static void main(String args[])
	{
	for(int i =1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
		
			System.out.println();
		}
	}
	
}

/*
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
 */




class Pattern13
{
	public static void main(String args[])
	{
		
		int alpha=64;
		
		for(int i =1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)(alpha+i)+" ");
			}
		
			System.out.println();
		}
	}
	
}
/*
     A
    B B
   C C C
  D D D D
 E E E E E
*/




class Pattern14
{
	public static void main(String args[])
	{
		for (int i=5;i>=1;i--)
		{
			for (int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
	}
}

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/




class Pattern15
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for (int k=5;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
	}
}

/*

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/



class Pattern16
{
	public static void main(String args[])
	{
		for (int i=5;i>=1;i--)
		{
			for (int k=5;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
	}
}

/*

5
5 4
5 4 3
5 4 3 2
5 4 3 2 1


*/


class Pattern17
{
	public static void main(String args[])
	{int count=0;
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("");
				count++;
				System.out.print(count+" ");
			}
			
			System.out.println();
		}
		
	}
	
}


/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/


class Pattern18
{
	public static void main(String args[])
	{
		
		int alpha=64;
		
		for (int i=5;i>=1;i--)
		{
			for (int k=1;k<=i;k++)
			{
				System.out.print((char)(alpha+k)+" ");
			}
			
			System.out.println();
		}
	}
}

/*

A B C D E
A B C D
A B C
A B
A

*/