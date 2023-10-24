package Classes;

public class Cylinder {
    private double height;
    private Circle base;

    public Cylinder(double r, double h){
        this.height = h;
        this.base = new Circle(r);
    }
    
    public double vol(){
        double volume = base.getArea() * height;
        return volume;
    }

    public double sa(){
        double surfarea = height * base.getCirc() + (2 * base.getArea());
        return surfarea;
    }
}
