public class APLine
{
  private double a,b,c;

  public APLine(int x,int y,int z) {
    a = x;
    b = y;
    c = z;

  }

  public double getSlope() {
  double boom = (-a)/b;
    return boom;


  }

  public boolean isOnLine(int xCord, int yCord) {
  if(((a*xCord)+(b*yCord)+c) == 0)
    return true;
    else{
    return false;
    }
  }

  
}
