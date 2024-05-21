package IdentifyTriangleType;
import java.util.Scanner;

public class TriagleIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter All Three sides of triangle ");
        System.out.print("Enter Side1 : ");
        float side1 = sc.nextFloat();
        System.out.print("Enter Side2 : ");
        float side2 = sc.nextFloat();
        System.out.print("Enter Side3 : ");
        float side3 = sc.nextFloat();

        if(side1==side2 && side2==side3)
        {
            System.out.println("Equilateral Triangle!!!");
        }else if(side1==side2 || side1==side3 || side2==side3){
            System.out.println("Isosceles Triangle!!!");
        }else{
            System.out.println("scalene Triangle!!!");
        }
    }
}
