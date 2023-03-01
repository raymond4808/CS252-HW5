import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class HW5Driver {
    // return the index of the MyPoint element in the list that's
    // closest to the origin (0, 0)
    public static int findClosestToOrigin(ArrayList<MyPoint> list){
        MyPoint zero = new MyPoint(0, 0);
        int indexHolder=0;
        double highNumber=list.get(0).distanceBetween(zero);

        for (int i = 1; i< list.size(); i++) {
            double checker= list.get(i).distanceBetween(zero);
            if (checker < highNumber) {
                highNumber= checker;
                indexHolder = i ;
            }
        }
        return indexHolder;
    }

    // Creates and returns a list of MyPoint objects
    private static ArrayList<MyPoint> createPointList() {
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

    public static void main(String[] args) {
        // create two Point objects
        MyPoint p1 = new MyPoint();
        p1.setX(5);
        p1.setY(10);

        MyPoint p2 = new MyPoint(3, 2);

// print each point
        System.out.println("p1 is " + p1);
        // will call toString() and return (x=5,y=10)
        // should print: p1 is (x=5,y=10)
        System.out.println("p2 is " + p2);
        // should print: p2 is (x=3,y=2)

        System.out.println("Distance between p1 and p2: " + p1.distanceBetween(p2));
        // result should be: 8.246211…

        ArrayList <MyPoint> arrayListerArraylist= createPointList();;
        //Code below displays all Point objects in the list in coordinate value
        /*for (MyPoint location:arrayListerArraylist){
            System.out.println(location);
        }*/
        System.out.println();
        System.out.println("The point closest to (0, 0) is: (" +arrayListerArraylist.get(findClosestToOrigin(arrayListerArraylist))+")");
        System.out.println();

        //create two Shape Objects with MyPoint objects values plus color
        Shape s1 = new Shape(p1, "Blue");
        Shape s2= new Shape(p2, "Red");
        System.out.println("S1 "+s1);
        System.out.println("S2 "+s2);

        System.out.println("Distance between s1 and s2 = "+s1.distanceBetweenCenters(s2));
        // result should be: 8.246211…
    } // end main

}
