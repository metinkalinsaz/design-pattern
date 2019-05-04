package designPatterns.abstractFactoryPattern.abstracFactoryPatternTest;

import designPatterns.abstractFactoryPattern.abstractFactory.AbstractFactory;
import designPatterns.abstractFactoryPattern.factoryProducer.FactoryProducer;
import designPatterns.abstractFactoryPattern.shape.Shape;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        FactoryProducer factoryProducer=new FactoryProducer();

        AbstractFactory abstractFactory=factoryProducer.getFactory(true);

        Shape shape1=abstractFactory.getShape("ROUNDEDRECTANGLE");

        shape1.draw();

        Shape shape2=abstractFactory.getShape("ROUNDEDSQUARE");

        shape2.draw();

        AbstractFactory abstractFactory1=factoryProducer.getFactory(false);

        Shape shape3=abstractFactory1.getShape("RECTANGLE");
        shape3.draw();

        Shape shape4=abstractFactory1.getShape("SQUARE");
        shape4.draw();

    }


}
