package Collinear_Points;
import java.awt.Color;
import java.util.Comparator;
import java.util.Scanner;
import edu.princeton.cs.algs4.StdDraw;

public class Point implements Comparable<Point> {

    private static final Color Black = null;
	private final int x;     // x-coordinate of this point
    private final int y;     // y-coordinate of this point

    /**
     * Initializes a new point.
     *
     * @param  x the <em>x</em>-coordinate of the point
     * @param  y the <em>y</em>-coordinate of the point
     */
    public Point(int x, int y) {
        /* DO NOT MODIFY */
        this.x = x;
        this.y = y;
    }

    /**
     * Draws this point to standard draw.
     */
    public void draw() {
        /* DO NOT MODIFY */
    	 StdDraw.point(x, y);
    	}
    /**
     * Draws the line segment between this point and the specified point
     * to standard draw.
     *
     * @param that the other point
     */
    public void drawTo(Point that) {
        /* DO NOT MODIFY */
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    /**
     * Returns the slope between this point and the specified point.
     * Formally, if the two points are (x0, y0) and (x1, y1), then the slope
     * is (y1 - y0) / (x1 - x0). For completeness, the slope is defined to be
     * +0.0 if the line segment connecting the two points is horizontal;
     * Double.POSITIVE_INFINITY if the line segment is vertical;
     * and Double.NEGATIVE_INFINITY if (x0, y0) and (x1, y1) are equal.
     *
     * @param  that the other point
     * @return the slope between this point and the specified point
     */
    public double slopeTo(Point that) {
        /* YOUR CODE HERE */
        if (this.x == that.x) {
            return this.y == that.y ?
                    Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }
        // avoid "-0.0".
        if (this.y == that.y) {
            return 0.0;
        }
        return (this.y - that.y) * 1.0 / (this.x - that.x);
    }

    /**
     * Compares two points by y-coordinate, breaking ties by x-coordinate.
     * Formally, the invoking point (x0, y0) is less than the argument point
     * (x1, y1) if and only if either y0 < y1 or if y0 = y1 and x0 < x1.
     *
     * @param  that the other point
     * @return the value <tt>0</tt> if this point is equal to the argument
     *         point (x0 = x1 and y0 = y1);
     *         a negative integer if this point is less than the argument
     *         point; and a positive integer if this point is greater than the
     *         argument point
     */
    public int compareTo(Point that) {
        /* YOUR CODE HERE */
        return this.y == that.y ? this.x - that.x : this.y - that.y;
    }

    /**
     * Compares two points by the slope they make with this point.
     * The slope is defined as in the slopeTo() method.
     *
     * @return the Comparator that defines this ordering on points
     */
    public Comparator<Point> slopeOrder() {
        /* YOUR CODE HERE */
        return new SlopeComparator(this);
    }

    private class SlopeComparator implements Comparator<Point> {

        private final Point point;

        SlopeComparator(Point point) {
            this.point = point;
        }

        @Override
        public int compare(Point p1, Point p2) {
            double slope1 = p1.slopeTo(point);
            double slope2 = p2.slopeTo(point);
            return slope1 == slope2 ? 0 : (slope1 > slope2 ? 1 : -1);
        }
    }

    /**
     * Returns a string representation of this point.
     * This method is provide for debugging;
     * your program should not rely on the format of the string representation.
     *
     * @return a string representation of this point
     */

    public String toString() {
        /* DO NOT MODIFY */
        return "(" + x + ", " + y + ")";
    }
    public void set(int x,int y) {
    	x=this.x;
    	y=this.y;
    }
    public int getx() {
    	return x;
    }
    public int gety() {
    	return y;
    }
    /**
     * Unit tests the Point data type.
     */
    public static void main(String[] args) {
        /* YOUR CODE HERE */
    	Point pp[]=new Point[30];
    	int i=0;
    	Point p=new Point(19000,10000);		
    	Point p1=new Point(18000,10000);
    	System.out.println(p.toString());
    	Point q=new Point(14000,10000);
    	Point p2=new Point(32000,10000);
    	Point p3=new Point(21000,10000);
    	Point p4=new Point(1234,5678);
    	Point p5=new Point(8500,3500);
    	StdDraw.setPenColor(StdDraw.RED);
    	System.out.println(p2.compareTo(p1));
    	System.out.println("SLope to q:"+p4.slopeTo(q));
    	StdDraw.setPenRadius(0.005);
    	StdDraw.setXscale(0,32767);
    	StdDraw.setYscale(0,32767);
    	p.draw();
    	i++;
    	p.drawTo(p1);
    	p1.draw();
    	p1.drawTo(p2);
    	p2.draw();
    	p2.drawTo(p3);
    	p3.draw();
    	p3.drawTo(p4);
    	p4.draw();
    	p4.drawTo(p5);
    	p5.draw();
    	p5.drawTo(q);
    	q.draw();
    	StdDraw.setPenColor(StdDraw.CYAN);
    	Point q1=new Point(10000,0);		
    	Point q2=new Point(0,10000);
    	Point q3=new Point(3000,7000);
    	Point q4=new Point(3000,7000);
    	Point q5=new Point(20000,21000);
    	Point q6=new Point(3000,4000);
    	Point q7=new Point(14000,15000);
    	Point q8=new Point(6000,7000);
    	q1.draw();
    	LineSegment ll[]=new LineSegment[10];
    	LineSegment l=new LineSegment(q1, q2);
    	l.draw();
    	ll[0]=l;
    	LineSegment l1=new LineSegment(q2, q3);
    	l1.draw();
    	ll[1]=l1;
    	LineSegment l2=new LineSegment(q3, q4);
    	l2.draw();
    	ll[2]=l2;
    	LineSegment l3=new LineSegment(q4, q5);
    	l3.draw();
    	ll[4]=l3;
    	LineSegment l4=new LineSegment(q5, q6);
    	l4.draw();
    	ll[5]=l4;
    	LineSegment l5=new LineSegment(q6, q7);
    	l5.draw();
    	ll[6]=l5;
    	LineSegment l6=new LineSegment(q7, q8);
    	l6.draw();
    	ll[7]=l6;
    	pp[i]=q8;
    	System.out.println(q5.compareTo(q3));
    	System.out.println("SLope to q8 :"+q5.slopeTo(q3));
    	p.slopeOrder();
    	}
}