import java.util.*;
//Ternary Operators
//To Find out the largest of three numbers
public class Operator{
    public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  int largestNumber=(a>b && a>c)?a:(b>a && b>c)?b:c;
  System.out.println(largestNumber);
    }
}