
package Lab7;

public class Line {
  private Point start;
private Point end;
public Line(Point st, Point en){
    this.start=st;
    this.end=en;
}
public Line(int x1, int y1, int x2, int y2){
    this.start= new Point(x1,y1);
    this.end= new Point(x2,y2);
}
    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public double length(){
        return this.start.distance(this.end);
    }

}
