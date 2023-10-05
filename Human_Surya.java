import java.util.*;
//Now we print age name age > 18 
class Human{
    int age;
    String name;
    float weight;

    public int setAge(int age){
        this.age=age;//Storing given input age into outside variable age by using this 
        if(this.age> 18){
            System.out.println("You are Valid");
            return this.age;
        }
        else{
            System.out.println("Your Not Valid in age");
            return 0;
        }
    }
    public void getAge(){
        System.out.println("Age is"+age);//Here age is outside refers
    }
    public String setName(String name){
        this.name=name;
        return name;
    }
    public void getName(){
        System.out.println("The Name You Entered is "+name);
    }
    public float setWeight(float weight){
        this.weight=weight;
        return weight;
    }
    public void getWeight(){
        System.out.println("the Weight You Entered is "+weight);
    }
}

public class Human_Surya{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        float weight=sc.nextFloat();

        //Creating An Object
        Human obj=new Human();

        int res=obj.setAge(age);
        String res_string=obj.setName(name);
        float res_weight=obj.setWeight(weight);

        System.out.println(res);
        System.out.println(res_string);
        System.out.println(res_weight);

        obj.getAge();
        obj.getName();
        obj.getWeight();
    }
}