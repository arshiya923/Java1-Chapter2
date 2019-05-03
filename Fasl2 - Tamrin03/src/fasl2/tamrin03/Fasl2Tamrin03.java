package fasl2.tamrin03;
import java.util.Scanner;
public class Fasl2Tamrin03
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("plz enter number: ");
        int number=obj.nextInt();
        
        if(number<100 || number>1000)
        {
            System.out.println("yes");
        }
    }
    
}
