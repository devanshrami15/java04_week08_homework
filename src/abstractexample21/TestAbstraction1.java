package abstractexample21;

//In real scenario, method is called by programmer or user

public class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s = new Circle();// In a real scenario, object is provided through method, eg, getShape() method.
        s.draw();
    }
}
