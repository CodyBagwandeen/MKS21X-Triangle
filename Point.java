public class Point{
  private double x;
  private double y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point( Point p) {
     Point point = new Point( p.x, p.y);
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public String toString(){
    return "(" + getX() + "," + getY() + ")";
  }

  public double distanceTo(Point p) {
    double dx = Math.pow(  this.getX() - p.getX(), 2) ;
    double dy = Math.pow(  this.getY() - p.getY(), 2) ;
    return Math.sqrt( dx + dy);
  }

  public static double distance(Point p1, Point p2) {
    double dx = Math.pow(  p1.x - p2.x, 2) ;
    double dy = Math.pow(  p1.y - p2.y, 2) ;
    return Math.sqrt( dx + dy);
  }
}
