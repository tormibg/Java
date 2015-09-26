package geometry.shapes.space;

import geometry.vertex.Vertex3D;

public class Cuboid extends SpaceShape{
    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertex3D vertices, double width, double height, double depth) {
        super(vertices);
        this.setWidth(width);
        this.setHeight(height);
        this.setDepth(depth);
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

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * this.getWidth() + 2 * this.getHeight() + 2 * this.getDepth();
    }

    @Override
    public double getVolume() {
        return this.getWidth() * this.getHeight() * this.getDepth();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Shape type = Cuboid"));
        result.append(super.toString());
        return result.toString();
    }
}
