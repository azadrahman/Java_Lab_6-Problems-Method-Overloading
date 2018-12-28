
package Lab_6;
public class invalidInputRangeException extends Exception {
   @Override
    public String toString() {
        return "invalidInputRangeException. Input number is not in the range of 0-100";
    } 
}
