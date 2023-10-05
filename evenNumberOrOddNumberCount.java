//Finding out how many Even Integers and odd integers are present
import java.util.*;
public class evenNumberOrOddNumberCount{
    public static void main(String argds[]){
      Scanner sc=new Scanner(System.in);
      int evenNumber=0;
      int oddNumber=0;
      int choice;
      
      
      do{
        int number = sc.nextInt();
        if(number % 2==0){
            evenNumber+=1;
            System.out.println(evenNumber);
        }
        else{
            oddNumber+=1;
            System.out.println(oddNumber);
        }
        System.out.println("If You Need To go out do 0");
        choice=sc.nextInt();
      }while(choice!=0);

      int sumOfevenNumber=evenNumber+oddNumber;
      System.out.println(sumOfevenNumber);

    }
}