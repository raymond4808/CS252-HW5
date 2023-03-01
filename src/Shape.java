public class Shape{
    private MyPoint center;
    private String color;

    public Shape (){}

    public Shape (MyPoint obj, String c){
        center = obj; //MyPoint Object attribute
        color= c;
    }

    //method that demands two different Shape.(attribute), call a method that takes two objects attributes and finds distance between them
    public double distanceBetweenCenters (Shape other){
        return this.center.distanceBetween(other.center);
    }

    public String toString(){
        return "Center: (x="+center.getX()+",y="+ center.getY()+ "); Color: "+ this.color;
    }
}
