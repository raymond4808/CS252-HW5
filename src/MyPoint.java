import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

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
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public double distanceBetween (MyPoint other){
        return Math.sqrt((Math.pow((other.getX()-this.getX()),2)+Math.pow((other.getY()-this.getY()),2)));
    }
    public String toString(){
        String returnString ="x="+this.x+",y="+this.y;
        return returnString;
    }

    // Creates and returns a list of MyPoint objects
    public ArrayList<MyPoint> createPointList() {
        ArrayList<MyPoint> list = new ArrayList<>();
        int count = 10;
        int min = -20, max = 20;

// create points out of (-20~20, -20~20) range
        for (int i=0; i<count; i++) {
            int x = ThreadLocalRandom.current().nextInt(min, max+1);
            int y = ThreadLocalRandom.current().nextInt(min, max+1);
            list.add(new MyPoint(x, y));
        }
        return list;
    }


}
