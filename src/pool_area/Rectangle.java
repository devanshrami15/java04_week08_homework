package pool_area;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width,double length){
        if ((width < 0) && (length < 0)){
            this.width = 0;
            this.length = 0;
        }else if ((width < 0) && (length > 0)){
            this.width = width;
            this.length = 0;
        }else {
            this.width = width;
            this.length = length;
        }
    }

    public double getWidth(){
        return width;
    }
    public double getlength(){
        return length;
    }
    public double getArea(){
        return (width * length);
    }
}
