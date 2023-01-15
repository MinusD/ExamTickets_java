package ru.minusd.ticket23;

public class ShapeFactory {
    public static Shape createShape(Shapes shape, double... args) {
        switch (shape) {
            case CIRCLE:
                return new Circle(args[0]);
            case RECTANGLE:
                return new Rectangle(args[0], args[1]);
            default:
                throw new IllegalArgumentException("Unknown shape");
        }
    }

    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape(Shapes.CIRCLE, 5);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        Shape rectangle = ShapeFactory.createShape(Shapes.RECTANGLE, 5, 10);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
    }
}
