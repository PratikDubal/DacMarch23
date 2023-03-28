
class Que7Num{
	public static void main(String args[])
	{
		int i=1;
		print_num(i);
		
        		
	}
	public static void print_num(int num)
	{

		
		if (num<=10)
		{	
		System.out.println(num);
	     print_num(num+1);
		}
	}
}