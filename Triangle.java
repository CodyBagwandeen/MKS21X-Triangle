public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle( Point vertex1, Point vertex2, Point vertex3) {
    v1 = vertex1;
    v2 = vertex2;
    v3 = vertex3;
  }

  public String getVert1() {
    return v1.getCords();
  }

  public String getVert2() {
    return v2.getCords();
  }

  public String getVert3() {
    return v3.getCords();
  }

  public double getPerim() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v1.distanceTo(v3);
  }
}
