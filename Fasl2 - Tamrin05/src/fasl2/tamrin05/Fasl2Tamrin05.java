package fasl2.tamrin05;
import java.util.Scanner;
public class Fasl2Tamrin05
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("plz enter number1: ");
        int num1=obj.nextInt();
        
        System.out.println("plz enter number2: ");
        int num2=obj.nextInt();
        
        System.out.println("plz enter number3: ");
        int num3=obj.nextInt();
        
        
        
        if(num1%7==0)
        {
            System.out.println("yes");
        }
        else if(num2%7==0)
        {
            System.out.println("yes");
        }
        else if(num3%7==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("nadarad");
        }
        
    }
    
}
