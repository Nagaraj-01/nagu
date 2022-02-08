 class Spy
{
	 public static void find(int num )
	{
		int sum=0;
		int last=0;
		int pro=1;
		while(num!=0)
		{
			last=num%10;
			num=num/10;
			sum=sum+last; []
			pro=pro*last;
		}
		if(sum==pro)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}


	}
		public static void main(String[] args)
		 {
			find(1124);
		}
}