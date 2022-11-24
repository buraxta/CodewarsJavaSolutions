public class Geometry{
  public static double squareArea(double A){
     double radius = (4*A)/(2*Math.PI);
     double square = Math.pow(radius, 2);
     return  Math.round(square*100)/100D;
  }
}
