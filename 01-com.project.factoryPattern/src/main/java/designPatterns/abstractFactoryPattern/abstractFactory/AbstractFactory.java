package designPatterns.abstractFactoryPattern.abstractFactory;

import designPatterns.abstractFactoryPattern.shape.Shape;

public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeType);
}
