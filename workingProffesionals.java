//Working Proffesionals

import java.util.Scanner;

public class workingProffesionals{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        //here For Day a person need to work for 9 hrs and for 7 days
        for(int i=0;i<7;i++){
            System.out.println("Day is "+i);
            for(int j=0;j<9;j++){
                System.out.println((j+9) +"-"+(j+10)+" Your Work is Done in "+((j+9) + "-"+(j+10))+" is "+ sc.nextLine());
            }
        }
    }
}