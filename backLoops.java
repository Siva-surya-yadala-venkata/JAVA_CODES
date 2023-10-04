//Loops ->Do While Loop ->While loop ->For Loop
//Prints The Do while Loop
//Print The Number From 1 to 10
//After printing 1 need to Hello 3 times

import java.util.*;
public class backLoops{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();

        do{
            System.out.println(i);
            int j=0;
            while( j <= 3){
                System.out.println("Hello"+j);
                j++;
            }
            i--;
        }while(i>=0);
        System.out.println("Thank You In Do While Loop!!");

        int v=10;
        while(v>=0){
              System.out.println(v);
              int j=0;
              do{
                System.out.println("hello"+j);
                j++;
              }while(j<=3);
              v--;
        }
        System.out.println("Thank You By While loop");

        for(int k=10;k>=0;k--){
            System.out.println(k);
            for(int j=0;j<=3;j++){
                System.out.println("Hello"+j);
            }

        }
        System.out.println("Thank you By For loop");
    }
}