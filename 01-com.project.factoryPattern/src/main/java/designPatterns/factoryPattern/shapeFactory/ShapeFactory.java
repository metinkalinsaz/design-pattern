package designPatterns.factoryPattern.shapeFactory;

import designPatterns.factoryPattern.shape.Shape;
import designPatterns.factoryPattern.shapeImpl.Circle;
import designPatterns.factoryPattern.shapeImpl.Rectangle;
import designPatterns.factoryPattern.shapeImpl.Square;


public class ShapeFactory {
    /**
     * Metin Kalinsaz
     */
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }

        return null;
    }


}
