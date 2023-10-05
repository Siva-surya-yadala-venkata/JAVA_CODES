//Creating an Class and Methods instialising The volume of square and rectangle and circle
import java.util.*;
class Area{
    float areaOfRectangle;
    float areaOfSquare;
    float areaOfCylinder;
    public float areaOfRectangle(float l,float b,float h){
         areaOfRectangle=l*b*h;
         return areaOfRectangle;
    }

    public float areaOfSquare(float a){
        areaOfSquare=a*a;
        return areaOfSquare;
    }
    public float areaOfCylinder(float r,float h){
        areaOfCylinder=3.1414f*r*r*h;
        return areaOfCylinder;
    }


}

public class areaFindingOut{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float length=sc.nextFloat();
        float breadth=sc.nextFloat();
        float height=sc.nextFloat();
        float a=sc.nextFloat();
        float radius=sc.nextFloat();

        Area obj=new Area();
        float resultOfRectangle=obj.areaOfRectangle(length,breadth,height);

        float resultOfSquare=obj.areaOfSquare(a);

        float resultOfCylinder=obj.areaOfCylinder(radius,height);

        System.out.println("The area of the rectangle "+resultOfRectangle);
        System.out.println("The area of the Square "+resultOfSquare);
        System.out.println("The area of the Cylinder "+resultOfCylinder);
    }
}