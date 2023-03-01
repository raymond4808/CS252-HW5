public class Shape extends MyPoint{
    private MyPoint center; //= new MyPoint ();
    private String color;

    public Shape (){}

    public Shape (MyPoint obj, String c){
        center = obj;
        color= c;
    }



    public double distanceBetweenCenters (Shape other){
        double distance = center.distanceBetween(other);
        return distance;
    }

    public String toString(){
        String centerReturn = "Center: (x="+center.getX()+",y="+ center.getY()+ "); Color: "+ this.color;;
        return centerReturn;
    }
}
