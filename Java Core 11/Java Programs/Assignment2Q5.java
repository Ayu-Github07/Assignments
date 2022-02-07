
abstract class Shape{
    abstract public String draw();
}

class Line extends Shape{

    Line(){
        System.out.println("Hii, I am constructor of Line Class");
    }
    @Override
    public String draw() {
        return "Draw a line...";
    }
}

class Rectangle extends Shape{
    Rectangle(){
        System.out.println("Hii, I am constructor of Rectangle Class");
    }
    @Override
    public String draw() {
        return "Draw a rectangle...";
    }
}

class Cube extends Shape{
    Cube(){
        System.out.println("Hii, I am constructor of Cube Class");
    }
    @Override
    public String draw() {
        return "Draw a cube...";
    }
}
public class Assignment2Q5 {
    public static void main(String[] args) {
        //Instance of line class has been instantiated.
        Line line = new Line();
        //Instance of rectangle class has been instantiated.
        Rectangle rectangle = new Rectangle();
        //Instance of cube class has been instantiated.
        Cube cube = new Cube();

        System.out.println(line.draw());
        System.out.println(rectangle.draw());
        System.out.println(cube.draw());
    }
}
