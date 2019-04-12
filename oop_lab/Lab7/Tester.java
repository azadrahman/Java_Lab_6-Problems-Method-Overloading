
package Lab7;
import javax.swing.JOptionPane;
public class Tester {
    public static void main(String arg[]){
        Point p1 = new Point(3,3);
        Point p2= new Point();
        double dis= p1.distance(p2);
        Line L1= new Line(p1,p2);
        Line L2=new Line(4,4,1,1);
        double lengthLine=L1.length();
        double lengthLine2= L2.length();
        JOptionPane.showMessageDialog(null, "LENGTH:"+lengthLine+"\nLENGTH2:"+lengthLine2);
        //JOptionPane.showMessageDialog(null,"DISTANCE:"+dis);
    }
}
