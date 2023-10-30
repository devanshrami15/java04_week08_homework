package constructor_overloading;

// Java program to overload constructors

public class Student5 {
    int id;
    String name;
    int age;

    //Creating two arg constructors

    Student5(int i,String n){
        id =i;
        name = n;
    }

    // creating three arg constructors

    Student5(int i,String n, int a){
        id = i;
        name = n;
        age = a;
    }

    public void display(){
        System.out.println(id +" "+ name + " " + age);
    }

    public static void main(String[] args) {
        Student5 s1 =new Student5(111,"karan");
        Student5 s2 = new Student5(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
