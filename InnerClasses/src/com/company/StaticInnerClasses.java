package com.company;
class Outer2
{
    int x=10;
    static int y=20;

    static class Inner2
    {
        public void show()
        {
            System.out.println(y);
        }
    }
}

public class StaticInnerClasses {
    public static void main(String[] args) {
        Outer2.Inner2 i = new Outer2.Inner2();
        i.show();
    }
}
