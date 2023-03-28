/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oppptit;
import java.util.*;
/**
 *
 * @author minh
 */
class Point{
    private double x,y;
    
    public Point(){
        
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point secondPoint){
        double distancex = secondPoint.x - this.x;
        double distancey = secondPoint.y - this.y;
        return Math.sqrt(distancex * distancex + distancey*distancey);
    }
    
    public double distance(Point p1, Point p2){
        double distanceX = p1.x-p2.x;
        double distanceY = p1.y-p2.y;
        return Math.sqrt(distanceX*distanceX + distanceY*distanceY);
    }
    
    @Override
    public String toString(){
        return "1";
    }
}

public class DienTichHinhTron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            Point c = new Point(sc.nextDouble(),sc.nextDouble());
            double AB = a.distance(b);
            double BC = b.distance(c);
            double CA = c.distance(a);
            if(AB + BC <= CA || AB + CA <= BC || BC + CA <= AB){
                System.out.println("INVALID");
            }
            else{
                double dt = 0.25 * Math.sqrt((AB+BC+CA)*(AB+BC-CA)*(AB-BC+CA)*(-AB+BC+CA));
                double r = (AB*BC*CA)/(4*dt);
                System.out.format("%.3f", Math.PI*r*r);
                System.out.println("");
            }
        }
        // TODO code application logic here
    }
    
}
