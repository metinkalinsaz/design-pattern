package designPatterns.abstractFactoryPattern.shapeFactory;

import designPatterns.abstractFactoryPattern.abstractFactory.AbstractFactory;
import designPatterns.abstractFactoryPattern.shape.Shape;
import designPatterns.abstractFactoryPattern.shapeImpl.Rectangle;
import designPatterns.abstractFactoryPattern.shapeImpl.Square;

public  class   ShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeType) {

        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }


        return null;
    }
}
