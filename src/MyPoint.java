public class MyPoint {
    private int x;
    private int y;
    public MyPoint (){}//end of method
    public MyPoint (int xValue, int yValue){
        this.x= xValue;
        this.y= yValue;
    }//end of method
    public void setX (int xValue){
        this.x=xValue;
    }//end of method
    public void setY (int yValue){
        this.y=yValue;
    }//end of method
    public int getX(){
        return this.x;
    }//end of method
    public int getY(){
        return this.y;
    }//end of method

    public double distanceBetween (MyPoint other){
        return Math.sqrt((Math.pow((other.getX()-this.getX()),2)+Math.pow((other.getY()-this.getY()),2)));
    }//end of method
    public String toString(){
        return "x="+this.x+",y="+this.y;
    }//End of MyPoint class



}
