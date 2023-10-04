import java.util.Scanner;

public class typeConversionsAndTypePromotions{
public static void main(String args[]){
    //TypeConversions & TypePromotions InJava
int a=23;
float b=a;
System.out.println("The Float value from int is"+b);
//TypeConversion we called
//here The Destination Type > Source Type


//If Desitination Type < Source Type Lets's take Input From User in an Integer Value
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Integer Value To type Convert into byte ");
int d=sc.nextInt();
//We need Convert into byte from the int
byte bytee=(byte)d;
System.out.println("The Converted Byte Form is"+bytee);

//if we give out of range of value then value % sizeOfDataType= output
/*
 Here The sizeOfByte is 255 so when i give 345 so then 345 % 255 = 89 gives the output
 If we give 200 which is low than the size so 200 % 245 = -56 gives the output
 */

}
}