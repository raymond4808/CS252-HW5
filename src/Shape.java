public class Shape extends MyPoint{
    private MyPoint center; //= new MyPoint ();
    private String color;

    public Shape (){}

    public Shape (MyPoint obj, String c){
        this.center = obj;
        this.color= c;
    }

    public double distanceBetweenCenters (Shape other){
        double distance = Shape.distanceBetween(other);
        return distance;
    }

    public String toString(){
        String centerReturn;
        centerReturn = "Center: (x="+Shape.getX()+",y="+ Shape.getY()+ "); Color:"+ this.color;
        return centerReturn;
    }
}
