package fasl2.tamrin06;
import java.util.Scanner;
public class Fasl2Tamrin06
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
        
        if(num1==num2 && num2==num3)
        {
            System.out.println("barabar hastand");
        }
        else
        {
            System.out.println("barabar nistand");
        }
        
    }
    
}
