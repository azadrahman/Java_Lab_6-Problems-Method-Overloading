// take 3 input as a number and print the greater one
package ifstatement;

import java.util.Scanner;
public class NestedIfElse {
    public static void main(String ar[])
    {
        Scanner obj= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number: ");
        a= obj.nextInt();
        System.out.println("Enter second number: ");
        b = obj.nextInt();
        System.out.println("Enter third number: ");
        c= obj.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("Greater Number is "+a);
            }
            else
            {
                System.out.println("Greater number is "+c);
            }
            
        }
        else
        {
            if(b>c)
            {
                System.out.println("Greater number is "+b);
            }
            else
            {
                System.out.println("Greater number is "+c);
            }
        }
    }
}
