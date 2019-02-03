
package parameterizedconstructor;


public class Rectangle {
    int length, width, res;
    Rectangle(int x, int y)
    {
        System.out.println("Parameterized Constractor ");
        length=x;
        width=y;
    }
    void rectArea()
    {
        res= length*width;
        System.out.println("Area of Rectangle "+res);
    }
}
