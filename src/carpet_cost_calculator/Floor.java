package carpet_cost_calculator;

public class Floor {
     private double width;
     private double length;

    public Floor(double width, double lenght) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea() { // return the calculated area of carpet

        return this.width* this.length;
    }

    }

