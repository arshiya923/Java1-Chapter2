package fasl2.tamrin08;
import java.util.Scanner;
public class Fasl2Tamrin08
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter number: ");
        int number=obj.nextInt();
        
        if(number>=10 && number<=20)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
    
}