public class Shape{
    private MyPoint center;
    private String color;

    public Shape (){}//end of constructor

    public Shape (MyPoint obj, String c){
        center = obj; //MyPoint Object attribute
        color= c;
    }//end of constructor

    //method that demands two different Shape.(attribute), call a method that takes Shape attributes and finds distance between them
    public double distanceBetweenCenters (Shape other){
        return this.center.distanceBetween(other.center);
    }//end of method

    public String toString(){
        return "Center: (x="+center.getX()+",y="+ center.getY()+ "); Color: "+ this.color;
    }// End of Shape Class
}
