package fasl2.tamrin02;
import java.util.Scanner;
public class Fasl2Tamrin02
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int number=obj.nextInt();
        
        if(number%5==0)
        {
            System.out.println("Yes");
        }    
        else
        {
            System.out.println("No");
        }
    }
}
