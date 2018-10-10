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


  public String getVert1() {
    return v1.toString();
  }

  public String getVert2() {
    return v2.toString();
  }

  public String getVert3() {
    return v3.toString();
  }

  public double getPerim() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v1.distanceTo(v3);
  }
}
