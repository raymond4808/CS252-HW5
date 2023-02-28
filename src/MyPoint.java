public class MyPoint {
    private int x;
    private int y;
    public MyPoint (){}
    public MyPoint (int xValue, int yValue){
        this.x= xValue;
        this.y= yValue;
    }
    public void setX (int xValue){
        this.x=xValue;
    }
    public void setY (int yValue){
        this.y=yValue;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


    public double distanceBetween (MyPoint other){
        return Math.sqrt(Math.pow((other.getX()-this.getX()),2)+Math.pow((other.getY()-this.getY()),2));
    }
    public String ();// test
}
