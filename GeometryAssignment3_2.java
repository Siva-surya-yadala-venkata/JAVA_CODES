//Here we going to derive a Geometry class

import java.util.Scanner;

class Geometry{
    //Here we are going to refer through Static variable won't need to create the object in this question

    double radius;
    double height;
    double pi=3.1414;
    double volume; //In static we can't get access from the class variable this is the problem
    //Here We are not using get and Set Printing From the set Method

    public static double cubeVolume(double height){
         double volume= height *height *height;
        return volume;
    }
    public static double cubeSurface(double height){
        double volume= 6* height *height;
        return volume;
    }
    public static double sphereVolume(double r){
        double volume=4/3 *3.1414 * r *r*r;
        return volume;
    }
    public static double sphereSurface(double r){
        double volume=4*3.1414*r*r;
        return volume;
    }
    public static double cylinderVolume(double r,double h){
        double volume= 3.1414*r*r*h;
        return volume;
    }
    public static double cylinderSurface(double r,double h){
        //2 * pie * r * h + 2*pi*r*r
        double volume=2*3.1414*r*h +(2*3.1414*r*r);
        return volume;
    }
    public static double coneVolume(double r,double h){
        double volume=3.1414*r*r*(h/3);
        return volume;
    }
    public static double coneSurface(double r,double h){
        double volume=3.1414 *r *(r+Math.sqrt(Math.pow(h, 2)+Math.pow(r, 2)));
        return volume;
    }
}

public class GeometryAssignment3_2{
    public static void main(String args[]){
        //Here we are not Creating Object
        Scanner sc=new Scanner(System.in);
         double radius=sc.nextDouble();
         double height=sc.nextDouble();


        double cubeVolume=Geometry.cubeVolume(height);
        System.out.println("The Cube Volume is "+cubeVolume);

        double cubeSurface=Geometry.cubeSurface(height);
        System.out.println("The Cube Surface is "+cubeSurface);

        double sphereVolume=Geometry.sphereVolume(radius);
        System.out.println("The Sphere Volume is "+sphereVolume);

        double sphereSurface=Geometry.sphereSurface(radius);
        System.out.println("The Sphere Surface is "+sphereSurface);

        double cylinderVolume=Geometry.cylinderVolume(radius, height);
        System.out.println("the Cylinder Volume is "+cylinderVolume);

        double cylinderSurface=Geometry.cylinderSurface(radius, height);
        System.out.println("The Cylinder Surface is "+cylinderSurface);

        double coneVolume=Geometry.coneVolume(radius, height);
        System.out.println("The Cone Volume is "+coneVolume);

        double coneSurface=Geometry.coneSurface(radius, height);
        System.out.println("the Cone Surface is "+coneSurface);

    }
}