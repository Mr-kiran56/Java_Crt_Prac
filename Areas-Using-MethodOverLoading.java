import java.util.*;
import java.lang.*;
public class Areas{
    static int option;
    static int a;
    static int b;
    static double c;
    static double d;

   static Scanner sc=new Scanner(System.in);
    static double Area(int a){
        return(Math.PI*Math.pow(a,2));
    }
    static double Area(double a){
        return (Math.pow(a,2));
    }
    static double Area(double a,double b){
        return(a*b);
    }
    static  double Area(int a,int b) {
        return (0.5 * a * b);
    }
    public static void main(String[]args){
        System.out.println("1. Area of Circle ");
        System.out.println("2. Area of Square ");
        System.out.println("3. Area of Rectangle ");
        System.out.println("4. Area of Triangle \n");
        System.out.print("Enter Your Option : ");
        option=sc.nextInt();

        switch (option){
            case 1:{
                System.out.print("Enter r value : ");
                a=sc.nextInt();
                System.out.println("The are of Square : "+Area(a));
                break;
            }
            case 2:{
                System.out.print("Enter s value :");
                c=sc.nextDouble();
                System.out.println("The are of Square : "+Area(c));
                break;
            }

            case 3:{
                System.out.print("Enter l value :");
                c=sc.nextDouble();
                System.out.print("Enter b value :");
                d=sc.nextDouble();
                System.out.println("The are of Rectangle : "+Area(c,d));
                break;
            }
            case 4:{
                System.out.print("Enter l value :");
                a=sc.nextInt();
                System.out.print("Enter b value :");
                b=sc.nextInt();
                System.out.println("The are of Triangle : "+Area(a,b));
                break;

            }

        }

    }
}

