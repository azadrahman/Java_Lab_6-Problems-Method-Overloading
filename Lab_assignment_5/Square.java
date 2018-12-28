
package Lab_5;

public class Square extends Box {
    public Square( double length, String Name)
    {
        this.length = length ;
        this.Name = Name ;
    }


    @Override
    double getPerimeter() {
        return 4 * length ;
    }

    @Override
    double getArea() {
        return length * length ;
    }
    
    @Override
    public String toString() {
        return Name + " -> " + "Area: " + getArea() + "Perimeter: " + getPerimeter();
    } 
}
