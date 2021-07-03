import java.lang.*;
class Literals
{
    public static void main(String arg[]) {
        byte b1=10;
        byte b2=0b1010;
        byte b3=012;
        byte b4=0XA;
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        
        long l=9999999999L;
        float f=12.56f;
        double d=12.56d;
        
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
		
		long x=999_999_999L;
		double y=127_890.56;
		
		System.out.println(x);
        System.out.println(y);
    }
}