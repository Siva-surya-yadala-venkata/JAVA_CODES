//Doing Array in java

import java.util.*;
public class ArrayInJava{
    public static void main(String args[]){

        //Array declaration 1:
        int arr[]={1,2,3,4};
        for(int i=0;i<=3;i++){
        System.out.println(arr[i]);
        }

        //Array declaration 2:
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        //giving elements dynamically 
        for(int i=0;i<n;i++){
            int varma=sc.nextInt();
            arr1[i]=varma;//stores in arr1
           
        }
        //printing the elements in the array
        for(int i=0;i<n;i++){
        System.out.println("The Element of the array is "+i+" is "+arr1[i]);//This is prints the total elements in the array
    }
}
}

