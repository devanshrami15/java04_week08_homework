package carpet_cost_calculator;

public class Carpet {
   private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
        public double getCost() { // return the cost of 1 sq.m. of carpet
            return this.cost;
        }
    }

