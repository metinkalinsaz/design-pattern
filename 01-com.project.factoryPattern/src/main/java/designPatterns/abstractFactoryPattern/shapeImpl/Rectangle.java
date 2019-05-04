package designPatterns.abstractFactoryPattern.shapeImpl;

import designPatterns.abstractFactoryPattern.shape.Shape;

public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Inside Rectangle: draw() method");
    }
}
