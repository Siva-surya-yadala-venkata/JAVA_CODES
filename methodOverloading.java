//Method Overloading
//Here the Same parameters with increase of the parametres and no need of changing name and we can change the data type
import java.util.*;
class Overloading{
    int sum;
    public int sum(int n1,int n2){
        sum=n1+n2;
        return n1+n2;//or return sum return n1+n2+n3 is one statement
    }
    public int sum(int n1,int n2,int n3){
        return n1+n2+n3; //If we are creating same name in MethodOverloading then there must be the same variables without losing any one variable but different data type
        /* public int sum(int n1,int n2){
       // sum=n1+n2+n3;
        return n1+n2+n3;//or return sum return n1+n2+n3 is one statement
    }
    public int sum(int n1,int n2,int n3,int sum)//Here we add there will be problem{
        return n1+n2+n3;*/
    }
    public void sum(){
        System.out.println("This is Int Form Sum "+sum);
    }
    public float sum(int n1,float n2){
        return n1+n2;
    }
    public float sum(float n1,int n2){
        return n1+n2;
    }
    public float sum(float n1,float n2,float sum){
        sum=n1+n2;
        return n1+n2;
    }
    public void sum(int s){//Here we donot involve parameter then the up sum and this will be same
        System.out.println(this.sum+"This is float Form");
    }
   /*  public float sum(int n1,int n2){
        return n1+n2;
    }
    not possible because here we defining parameter of int both of them eiter one should be the datatype parameter given variable
    */
}

public class methodOverloading{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();

        float num1=sc.nextFloat();
        float num2=sc.nextFloat();

        //creating an Object
        Overloading obj=new Overloading();

        int result_sum=obj.sum(number1,number2);
        int result_sum_three_parameters=obj.sum(number1,number2,number3);
        
        float res_int_two_parameters=obj.sum(number1,number2);
        float res_int_one_parameter=obj.sum(number1,num1);
        float  res_one_int_parameter=obj.sum(num1,number1);
        float res_float_two_parameters=obj.sum(num1,num2,0);
        

        System.out.println(result_sum);
        System.out.println(result_sum_three_parameters);
        obj.sum();//void of the int function
        System.out.println(res_int_two_parameters);
        System.out.println(res_int_one_parameter);
        System.out.println(res_one_int_parameter);
        System.out.println(res_float_two_parameters);
        obj.sum(number1);//this Float sum void


    }
}