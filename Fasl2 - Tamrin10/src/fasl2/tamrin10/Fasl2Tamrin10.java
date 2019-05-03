package fasl2.tamrin10;
import java.util.Scanner;
public class Fasl2Tamrin10
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter number1: ");
        int num1=obj.nextInt();
        
        System.out.print("plz enter number2: ");
        int num2=obj.nextInt();
        
        if(num1>20 && num2>20)
        {
            System.out.println("Yes");
        }
    }
    
}
