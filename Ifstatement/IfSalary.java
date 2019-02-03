/*
 take an input as salary. if salary>=10000 
get 10% bonus. Simple if statement.
 */
package ifstatement;
import java.util.Scanner;
public class IfSalary {
    public static void main(String ar[])
    {
        Scanner obj= new Scanner(System.in);
        int sal, b;
        System.out.println("Enter your salary: ");
        sal= obj.nextInt();
        if(sal>=10000)
        {
            b= (sal*10)/100;
            sal= sal+b;
        }
        System.out.println("Salary is "+ sal);
    }
}
