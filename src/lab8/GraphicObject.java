package lab8;

public abstract class GraphicObject {
    private double x;
    private double y;
     //get
   public abstract void findArea();
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}//set
