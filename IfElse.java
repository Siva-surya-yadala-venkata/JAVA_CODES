//If Else Operator For Java
import java.util.*;
public class IfElse{
public static void main(String args[]){
    //Print the age if age > 18 and and give the loan to them
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    System.out.println(age);
    if(age > 18){
        float loan=0.1f;
        int salary=sc.nextInt();
        double totalAmount=salary+salary*loan;
        System.out.println(totalAmount);
    }
    else{
        System.out.println("Your age is satisifed to the bank");
    }
}
}