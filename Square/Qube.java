
package square;

import java.util.Scanner;
public class Qube {
    public static void main(String[] args){
        float a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number");
        a= obj.nextFloat();
        System.out.println("Qube is "+  (a*a*a));
    }
    
}
