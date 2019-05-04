package designPatterns.factoryPattern.factoryPatternTest;

import designPatterns.factoryPattern.shape.Shape;
import designPatterns.factoryPattern.shapeFactory.ShapeFactory;


public class FactoryPatternDemo {
    /**
     * Metin Kalinsaz
     */
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //Shape shape1=new ShapeFactory().getShape("CIRCLE");

        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        Shape shape3 = shapeFactory.getShape("SQUARE");

        shape1.draw();
        shape2.draw();
        shape3.draw();

    }
}
