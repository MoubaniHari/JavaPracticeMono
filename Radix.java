import java.lang.*;
import java.util.*;
class Radix
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		s.useRadix(2);
		int x = s.nextInt();
		System.out.println(x);
	}
}