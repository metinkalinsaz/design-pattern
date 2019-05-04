package designPatterns.abstractFactoryPattern.factoryProducer;

import designPatterns.abstractFactoryPattern.abstractFactory.AbstractFactory;
import designPatterns.abstractFactoryPattern.roundedShapeFactory.RoundedShapeFactory;
import designPatterns.abstractFactoryPattern.shapeFactory.ShapeFactory;

import static java.lang.Boolean.valueOf;

public class FactoryProducer {

public  AbstractFactory getFactory(boolean rounded) {

    if (rounded) {

        return new RoundedShapeFactory();
    }else
            return new ShapeFactory();


    }


}


