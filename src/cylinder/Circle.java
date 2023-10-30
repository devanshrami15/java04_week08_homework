/**
 * Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
 *
 * The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
 *
 * In case the radius parameter is less than 0 it needs to set the radius field value to 0.
 */


package cylinder;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius =radius;
        if(radius < 0){
            this.radius = 0;
        }
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return (Math.pow(this.radius,2) * Math.PI);
    }
}
