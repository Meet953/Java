class TestChar
{
	public static void main(String args[])
	{
		char ch;
			ch = args[0].charAt(0);
		if (ch >= 65 && ch <= 90)
      System.out.println("Character is Upper Case Letters");
		else if(ch >= 97 && ch <= 122)
      System.out.println("Character is in Lower Case Letters");
	  else
	  System.out.println("It is a Number");
	}
}