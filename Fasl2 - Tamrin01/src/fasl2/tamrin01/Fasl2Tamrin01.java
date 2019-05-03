package fasl2.tamrin01;
import java.util.Scanner;
public class Fasl2Tamrin01
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        int num1=obj.nextInt();
        
        System.out.print("Enter Second Number: ");
        int num2=obj.nextInt();
        
        if(num1<num2)
        {
            System.out.println("adade bozorg: "+num2);
        }
        else
        {
            System.out.println("adade bozorg: "+num1);
        }
        
    }
    
}
