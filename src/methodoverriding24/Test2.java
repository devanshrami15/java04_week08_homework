package methodoverriding24;

//Test class to create objects and call the methods.

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("SBI Rate Of Interest : " + s.getRateOfInterest());
        System.out.println("ICICI Rate Of Interest : " + i.getRateOfInterest());
        System.out.println("AXIS Rate Of Interest : " + a.getRateOfInterest());

    }
}
