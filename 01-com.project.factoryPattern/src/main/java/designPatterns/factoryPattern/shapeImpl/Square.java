package designPatterns.factoryPattern.shapeImpl;

import designPatterns.factoryPattern.shape.Shape;

public class Square implements Shape {

    public void draw() {
        System.out.println("This is a Square");
    }
}
