//Write The Java Program Whether Number is Positive or not
import java.util.*;

public class numberPositiveOrNot{
    public static void main(String args[]){
      System.out.println("Enter The Number Whether The nUmber is Positive or Not");
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      if(number >0){
        System.out.println("The Number is Positive "+number);

      }
      else if (number<0) {
        System.out.println("the Number is negative "+number);
      }
      else{
      System.out.println("The Number is Zero "+number);
      }
    }
}