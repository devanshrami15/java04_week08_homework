package methodoverriding23;

//This is Child class.

public class Bike2 extends Vehicle{
    //This is same method as in the parent class we made.

    public void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {

        //Create the Object.
        Bike2 obj = new Bike2();
        obj.run(); // Method Calling
    }
}
