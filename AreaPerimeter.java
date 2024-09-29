//8.	Write a Java program to create an abstract class named Shape that contains two integers and an empty method named print Area (). Provide three classes named Rectangle, Triangle, and Circle such that each one of the classes extends the class Shape. Each one of the classes contains only the method print Area () that prints the area of the given shape
class AreaPerimeter {
    public static void main(String[] args) {
        Shape obj1 = new Rectangle(10, 20);
        obj1.printArea(); 
        
        Shape obj2 = new Triangle(30, 40);
        obj2.printArea();  
        
        Shape obj3 = new Circle(1);
        obj3.printArea();  
    }
}

abstract class Shape {
    int a;
    int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of Rectangle is: " + (a * b));
    }
}

class Triangle extends Shape {
    public Triangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of Triangle is: " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    public Circle(int r) {
        super(r, 0); 
    }

    void printArea() {
        System.out.println("Area of Circle is: " + (3.14 * a * a)); 
    }
}
