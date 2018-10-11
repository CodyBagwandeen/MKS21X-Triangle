public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle( Point vertex1, Point vertex2, Point vertex3) {
    v1 = vertex1;
    v2 = vertex2;
    v3 = vertex3;
  }

  public Triangle( double d1, double d2, double d3, double d4, double d5, double d6) {
    Point p1 = new Point( d1, d2);
    Point p2 = new Point ( d3, d4);
    Point p3 = new Point( d5, d6);
    v1 = p1;
    v2 = p2;
    v3 = p3;
  }

  public Point getVertex( int index) {
    if ( index == 0) {
      Point p = new Point( v1.getX(), v1.getY());
      return p;
    }
    if ( index == 1) {
      Point p = new Point( v2.getX(), v2.getY());
      return p;
    }
    if ( index == 2) {
      Point p = new Point( v3.getX(), v3.getY());
      return p;
    }
    return null;
  }

  public void setVertex(int index, Point p) {
    if ( index == 0) {
      Point pnew = new Point( p.getX(), p.getY());
      v1 = pnew;
    }
    if ( index == 1) {
      Point pnew = new Point( p.getX(), p.getY());
      v2 = pnew;
    }
    if ( index == 2)  {
      Point pnew = new Point( p.getX(), p.getY());
      v3 = pnew;
    }
  }

 public String toString() {
   return "Triangle: A" + v1 + " B" + v2 + " C" + v3;
 }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v1.distanceTo(v3);
  }
}
