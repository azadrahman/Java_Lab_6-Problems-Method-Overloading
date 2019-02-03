// take an input as a marks and print Grade using else if.
package ifstatement;

import java.util.Scanner;
public class ElseIfLadder {
    public static void main(String ar[])
    {
        Scanner obj= new Scanner(System.in);
        int marks;
        char grade;
        System.out.println("Enter your marks");
        marks= obj.nextInt();
        if(marks>= 85)
        {
            grade= 'A';
        }
        else if(marks>=75)
        {
            grade= 'B';
        }
        else if(marks>=65)
        {
            grade= 'C';
        }
        else if(marks>=55)
        {
            grade= 'D';
        }
        else
        {
          grade= 'F'; 
        }
        System.out.println("Grade : "+grade);
    }
}
