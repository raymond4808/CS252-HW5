import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class MyPoint {
    private static int x;
    private static int y;
    public MyPoint (){}
    public MyPoint (int xValue, int yValue){
        this.x= xValue;
        this.y= yValue;
    }
    public static void setX (int xValue){
        x=xValue;
    }
    public static void setY (int yValue){
        y=yValue;
    }
    public static int getX(){
        return x;
    }
    public static int getY(){
        return y;
    }


    public static double distanceBetween (MyPoint other){
        return Math.sqrt(Math.pow((other.getX()- getX()),2)+Math.pow((other.getY()-getY()),2));
    }
    public String toString(){
        String returnString ="x="+this.x+",y="+y;
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
