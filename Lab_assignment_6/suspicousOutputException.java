
package Lab_6;

public class suspicousOutputException extends Exception {
@Override
    public String toString() {
        return "SuspiciousOutputException! Average can not be 95 up."; 
    }
}
