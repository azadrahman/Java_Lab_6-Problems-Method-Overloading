
package Lab_6;

public class studentFailedException extends Exception {
    @Override
    public String toString() {
        return "studentFailedException.  Average is less than 40"; 
    }
}
