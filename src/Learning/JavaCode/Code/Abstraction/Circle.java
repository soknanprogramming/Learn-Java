package Learning.JavaCode.Code.Abstraction;

public class Circle extends Shape{
    private final double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
