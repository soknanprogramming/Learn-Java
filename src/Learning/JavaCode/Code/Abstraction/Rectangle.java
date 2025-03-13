package Learning.JavaCode.Code.Abstraction;

public class Rectangle extends Shape{
    private final double length;
    private final double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double area(){
        return length * width;
    }
}
