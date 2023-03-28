class Pyramid4
{
	public static void main(String args[])
	{
		

	
		for (int i=1;i<=9;i++)
		{
			for (int k=8;k>=i;k--)
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int ii=1;ii<=8;ii++)
		{
			for (int kk=1;kk<=ii;kk++)
			{
				System.out.print("  ");
			}
			for(int jj=1;jj<=ii;jj++)
			{
				System.out.print(jj+" ");
			}
			System.out.println();
		}
	
		}
		
	
}