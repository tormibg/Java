package geometry.shapes.space;

import geometry.vertex.Vertex3D;

public class Sphere extends SpaceShape{
    private double radius;
    public Sphere(Vertex3D vertices, double radius) {
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
        return 4 * Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(this.getRadius(), 3);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Shape type = Sphere"));
        result.append(super.toString());
        return result.toString();
    }
}
