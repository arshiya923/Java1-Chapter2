package fasl2.tamrin09;
import java.util.Scanner;
public class Fasl2Tamrin09
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter number: ");
        int number=obj.nextInt();
        
        if(number%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    
}
