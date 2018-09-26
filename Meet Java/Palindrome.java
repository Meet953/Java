class Palindrome
{
	public static void main(String[] args)
	{
		String ch,rev = "";
		ch = args[0];
		int length = ch.length();
		for ( int i = length - 1; i >= 0; i-- )
         rev = rev + ch.charAt(i);
 
      if (ch.equals(rev))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
	}
}