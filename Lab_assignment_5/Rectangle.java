
package Lab_5;

public class Rectangle extends Box{
     double width ;
    
    public Rectangle( double length, double width, String Name)
    {
        this.length = length ;
        this.width = width ;
        this.Name = Name ;
    }
    @Override
    double getPerimeter() {
        return ( width + length ) * 2 ;
    }

    @Override
    double getArea() {
        return length * width ;
    }

    @Override
    public String toString() {
        return Name + " -> " + "Area: " + getArea() + "Perimeter: " + getPerimeter();
    }
}
