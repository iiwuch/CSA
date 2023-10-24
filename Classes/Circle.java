package Classes;

public class Circle {
    private double radius;

    public Circle(double r){
        this.radius = r;
    }

    public double getArea(){
        double result = Math.PI * (Math.pow(radius, 2));
        return result;
    }

    public double getCirc(){
        double result = 2 * Math.PI * radius;
        return result;
    }
}
