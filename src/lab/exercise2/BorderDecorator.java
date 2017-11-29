package lab.exercise2;

public abstract class BorderDecorator implements Shape{
    private Shape shapeToBeDecorated; 
    
    public BorderDecorator(Shape shapeToBeDecorated){
        setShapeToBeDecorated(shapeToBeDecorated);
    }
    
    @Override
    public void draw(){
        shapeToBeDecorated.draw();
    }

    public final Shape getShapeToBeDecorated() {
        return shapeToBeDecorated;
    }

    public final void setShapeToBeDecorated(Shape shapeToBeDecorated) throws IllegalArgumentException{
        if(shapeToBeDecorated == null) throw new IllegalArgumentException("Shape May Not Be Null");
        this.shapeToBeDecorated = shapeToBeDecorated;
    }
}
