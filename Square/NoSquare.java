package square;

import java.util.Scanner;

public class NoSquare {

    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number ");
        a = obj.nextInt();
        System.out.println("Square is " + (a * a));
    }
}
