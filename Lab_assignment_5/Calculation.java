
package Lab_5;
import java.util.Scanner;
public class Calculation {
   private static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {
        
            System.out.println("Press 1 for square, 2 for rectangle. \nEnter your choice :  ");
            int choice = scanner.nextInt() ;
            String consume = scanner.nextLine() ; // To get the newline character.
            if( choice == 1)
            {
                calculateForSquare();
            }
            else if ( choice == 2)
            {
                calculateForRectangle() ;
            }
        
    }
    private static void calculateForSquare()
    {
           System.out.println("Please, enter a name for the square : ");
            String name = scanner.nextLine() ;
            System.out.println("Please, enter the length of a side : ");
            double length = scanner.nextDouble() ;
            
            Square s = new Square(length, name) ;
            System.out.println(s);
    }

    private static void calculateForRectangle() {
        
            System.out.println("Please, enter a name for the rectangle : ");
            String name = scanner.nextLine() ;
            System.out.println("Please, enter  length of the rectangle : ");
            double length = scanner.nextDouble() ;
            System.out.println("Please, enter  width of the rectangle : ");
            double width = scanner.nextDouble() ;
            
            Rectangle r = new Rectangle(length, width, name) ;
            System.out.println(r);
    }  
}
