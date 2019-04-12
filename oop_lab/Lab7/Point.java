/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;
public class Point {
    private int x;
    private int y;
 public Point(int first, int sec){
     this.x=first;
     this.y=sec;
 }
 public Point(){
     this.x=0;
     this.y=0;
 }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public String toString(){
        return "Point[x="+x+",y="+y+"]";
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(p.getY()-this.getY(),2)+
                Math.pow(p.getX()-this.getX(),2));
    }
}
