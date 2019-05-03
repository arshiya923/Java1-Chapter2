package fasl2.tamrin07;
import java.util.Scanner;
public class Fasl2Tamrin07
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("plz enter number: ");
        int number=obj.nextInt();
        
        if(number<0)
        {
            number=number*-1;
            
            System.out.println(number);
        }
        else
        {
            System.out.println(number);
        }
    }
    
}
