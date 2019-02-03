/* take an input as a salary. if salary>=10000 get 10% bonus
add on salary. Else get 5% bonus add on salary. If else statement.
*/
package ifstatement;

import  java.util.Scanner;
public class IfEsleStatement {
    public static void main(String ar[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENter your salary");
        int sal= obj.nextInt();
        if(sal>=10000)
        {
            int b= (sal*10)/100;
            sal= sal+b;
        }
        else
        {
            int b= (sal*5)/100;
            sal= sal+b;
        }
        System.out.println("Total salary is "+ sal);
    }
}
