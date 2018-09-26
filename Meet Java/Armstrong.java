class Armstrong
{
	public static void main(String[] args) 
	{
		int a,no,arm=0,d;
		no = Integer.parseInt(args[0]);
		d=no;  
		while(no>0)
		{
			a=no%10;
			no=no/10;
			arm=arm+a*a*a;
		}
		if(arm==d)
		{
			System.out.println("Armstrong Number: " + d );
		}
		else
		{
			System.out.println("Not Armstrong Number: " + d);
		}
	}
}	