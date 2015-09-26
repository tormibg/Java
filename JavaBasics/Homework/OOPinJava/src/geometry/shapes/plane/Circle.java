package geometry.shapes.plane;

import geometry.vertex.Vertex;

public class Circle extends PlaneShape{
    private double radius;

    public Circle(Vertex vertices, double radius) {
        super(vertices);
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    public double getPerimeter() {
        return Math.PI * this.getRadius() * 2;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Shape type = Circle"));
        result.append(super.toString());
        return result.toString();
    }
}
