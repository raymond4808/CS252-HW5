import java.util.ArrayList;

public class HW5Driver {
    // return the index of the MyPoint element in the list that's
    // closest to the origin (0, 0)
    public static int findClosestToOrigin(ArrayList<MyPoint> list){
        MyPoint zero = new MyPoint(0, 0);
        int holder=0;
        double highNumber=9999999.0;

        for (int i = 0; i< list.size(); i++) {
            double checker= list.get(i).distanceBetween(zero);
            if (checker < highNumber) {
                highNumber= checker;
                holder = i ;
            }
        }
        return holder;
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

        System.out.println("Distance between p1 and p2: " + p1.distanceBetween(p2) );
        // result should be: 8.246211…

        ArrayList <MyPoint> P1Arraylist = p1.createPointList();
        //Code below displays all Point objects in the list in coordinate value
        /*for (MyPoint location:P1Arraylist){
            System.out.println(location);
        }*/

        System.out.println("The point closest to (0, 0) is: (" +P1Arraylist.get(findClosestToOrigin(P1Arraylist))+")");
    } // end main
        //Question 3 of the page
}
