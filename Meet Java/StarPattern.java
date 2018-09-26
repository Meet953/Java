class StarPattern
{
	public static void main(String[] args) 
	{
		int i,j,k,no;
		no = Integer.parseInt(args[0]);
		for(i=1; i<=no; i++)
		{
			for(j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=(2*i-1); k++)
			{
				System.out.print("*");
			}
		System.out.println("");
		}
	}
}