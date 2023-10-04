import java.util.*;

import javax.swing.text.Style;
public class Basics{
    public static void main(String args[]){
        int a=10;
        int b=10;
        float c=12.5f;
        double d=16.5;
        byte varma=100;
        boolean is_True_Or_Not=true;
        short varma2=23;
        long varma3=24l;
        String name="YV SIVA SURYA";
        char character='c';


        System.out.println("The Number of integer is "+a+","+b);
        System.out.println("The Number Of The Double and Float is"+d+","+c);
        System.out.println(varma);
        System.out.println(is_True_Or_Not);
        System.out.println(name);
        System.out.println(character);
        System.out.println(varma3);
        System.out.println(varma2);

        //INput From User
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=sc.nextInt();
        System.out.println("Enter The Float value");
        float value=sc.nextFloat();
        System.out.println("Enter The Double Value");
        double value2=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter The String");
        String str=sc.nextLine();
        System.out.println("Enter The Character");
        String character_name=sc.next();
        System.out.println("Enter The Byte Value");
        byte bytee=sc.nextByte();
        System.out.println("Enter The Short Value");
        short shortiee=sc.nextShort();
        System.out.println("Enter The Long Value");
        long longiee=sc.nextLong();
        System.out.println("Enter The Boolean value");
        boolean booliee=sc.nextBoolean();
        System.out.println(number+","+value+","+value2+","+str+","+character+","+bytee+","+shortiee+","+longiee+","+booliee+","+"Thank You !!");



    }
}