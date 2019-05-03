package fasl2.tamrin11;
import java.util.Scanner;
public class Fasl2Tamrin11
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter number1: ");
        int a=obj.nextInt();
        
        System.out.print("plz enter number2: ");
        int b=obj.nextInt();
        
        System.out.print("plz enter number3: ");
        int c=obj.nextInt();
        
        if(a==b && b==c)
        {
            System.out.println("motesavi azla");
        }
        else if(a==b || b==c || a==c)
        {
            System.out.println("motesavi alsaqeyn");
        }
        else
        {
            System.out.println("mamooli");
        }
    }
    
}
