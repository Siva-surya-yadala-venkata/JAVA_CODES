import java.util.*;
//Switch cases
public class switchCases{
    public static void main(String args[]){
       System.out.println("Going to Find out Which day is going on this week");
        System.out.println("Enter The Day Value");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1:{
            System.out.println("This is Monday");
            break;
            }
            case 2:{
            System.out.println("this is Tuesday");
            break;
            }
            case 3:
            {
                System.out.println("This is Wednesday");
                break;
            }
            case 4:{
                System.out.println("This is Thrusday");
                break;
            }
            case 5:
            {
                System.out.println("This is friday");
                break;
            }
            case 6:
            {
                System.out.println("This is Saturday");
                break;
            }
            case 7:
            {
                System.out.println("This is Sunday");
                break;
            }
default:
System.out.println("You Entered wrong number");
        }
    }
}