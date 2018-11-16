/*2) create a class Rectangle with two data members- length and breadth
and a method to claculate the area of rectangle. the class has
three constructor which are:
1. -having no parameter
2. -having two numbers as parameters
3. -having one number as parameter
create object of the 'Rectangle' class having none, one and two
parameters and print their areas.
*/
package midterm;
public class Rectangle {
    int length, breadth;
    Rectangle(){
        System.out.println("Constructor 1: having no parameter");
    }
    Rectangle(int x, int y){
        length=x;
        breadth=y;
     System.out.println("Constructor 2: having one parameter");
    }
    Rectangle(int a){
        length=a;
        breadth=a;
    System.out.println("Constructor 3: having two parameter");
    }
    void cal(){
        int area=length*breadth;
        System.out.println("Area is: "+area);
    }
}
class Main{
    public static void main(String ar[]){
        Rectangle obj= new Rectangle();
        Rectangle obj1= new Rectangle(7);
        Rectangle obj2= new Rectangle(5,7);
        obj1.cal();
        obj2.cal();
    }
}
