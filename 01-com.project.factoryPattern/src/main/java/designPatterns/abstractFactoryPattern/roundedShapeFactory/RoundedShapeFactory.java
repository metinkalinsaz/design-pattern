package designPatterns.abstractFactoryPattern.roundedShapeFactory;

import designPatterns.abstractFactoryPattern.abstractFactory.AbstractFactory;
import designPatterns.abstractFactoryPattern.shape.Shape;
import designPatterns.abstractFactoryPattern.shapeImpl.RoundRectangle;
import designPatterns.abstractFactoryPattern.shapeImpl.RoundSquare;

public class RoundedShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeType) {

        if(shapeType.equalsIgnoreCase("ROUNDEDRECTANGLE")){
            return new RoundRectangle();
        }else if(shapeType.equalsIgnoreCase("ROUNDEDSQUARE")){
            return new RoundSquare();
        }


        return null;
    }
}
