package lab.exercise2;

public class RedBorderDecorator extends BorderDecorator{
    
    public RedBorderDecorator(Shape shapeToBeDecorated) {
        super(shapeToBeDecorated);
    }
    
    @Override
    public void draw(){
        super.draw();
        System.out.println("Border: Red");
    }
}
