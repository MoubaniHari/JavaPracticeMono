package com.company;

import java.util.Scanner;
class Rectangle1{
    static int area(int l, int b) throws Exception {
        if (l < 0 || b < 0)
            throw new Exception();
        return l * b;
    }
}
public class FinallyBlock {
        public static void main(String[] args) throws Exception {
            Scanner s = new Scanner(System.in);
            int l = s.nextInt();
            int b = s.nextInt();
            try{
                System.out.println("The area is " + Rectangle1.area(l,b));
            }
//            catch(NegativeValuesException e){
//                System.out.println(e);
//            }
            finally{
                System.out.println("The program is end.");
            }
        }

}
