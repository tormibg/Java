package geometry.shapes.plane;

import geometry.vertex.Vertex2D;

public class Rectangle extends PlaneShape{
    private double width;
    private double height;

    public Rectangle(Vertex2D vertices, double width, double height) {
        super(vertices);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }

    @Override
    public double getPerimeter() {
        return (this.getHeight() + this.getWidth()) * 2;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Shape type = Rectangle"));
        result.append(super.toString());
        return result.toString();
    }
}
