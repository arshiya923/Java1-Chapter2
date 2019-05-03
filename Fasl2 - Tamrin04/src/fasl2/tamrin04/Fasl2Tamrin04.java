package fasl2.tamrin04;
import java.util.Scanner;
public class Fasl2Tamrin04
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("plz enter number1: ");
        int num1=obj.nextInt();
        
        System.out.println("plz enter number2: ");
        int num2=obj.nextInt();
        
        System.out.println("plz enter number: ");
        int num3=obj.nextInt();
        
        System.out.println("plz enter number4: ");
        int num4=obj.nextInt();
        
        if(num1%2==0)
        {
            System.out.println(num1);
        }
        else if(num2%2==0)
        {
            System.out.println(num2);
        }
        else if(num3%2==0)
        {
            System.out.println(num3);
        }
        else if(num4%2==0)
        {
            System.out.println(num4);
        }
    }
    
}
