abstract class Shape {
    abstract void draw();

    void message() {
        System.out.println("Message from Shape");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("Draw Rectangle Using Length & Breadth..");
    }
}

public class Program1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.draw();
        r.message();
    }
}
