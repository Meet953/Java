class Prime
{
	public static void main(String args[])
	{
		int i,n,j;
		n = Integer.parseInt(args[0]);
		for(i=2;i<n;i++)
		{
			if(n%i == 0)
			{
				System.out.println("Not a Prime Number : " + n);
				break;
			}
		}
		if(i==n)
		{
			System.out.println("Prime Number : " + n);
		}
	}
}