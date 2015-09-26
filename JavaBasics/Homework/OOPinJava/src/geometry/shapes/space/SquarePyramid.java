package geometry.shapes.space;

import geometry.vertex.Vertex3D;

public class SquarePyramid extends SpaceShape{
    private double baseWidth;
    private double pyramidHeight;

    public SquarePyramid(Vertex3D vertices, double baseWidth, double pyramidHeight) {
        super(vertices);
        this.setBaseWidth(baseWidth);
        this.setPyramidHeight(pyramidHeight);
    }

    public double getBaseWidth() {
        return baseWidth;
    }

    public void setBaseWidth(double baseWidth) {
        this.baseWidth = baseWidth;
    }

    public double getPyramidHeight() {
        return pyramidHeight;
    }

    public void setPyramidHeight(double pyramidHeight) {
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public double getArea() {
        return (this.getBaseWidth() * this.getBaseWidth()) + 2 * this.getBaseWidth() *
                Math.sqrt((this.getBaseWidth() * this.getBaseWidth() / 4) + (this.getPyramidHeight() * this.getPyramidHeight()));
    }

    @Override
    public double getVolume() {
        return this.getBaseWidth() * this.getBaseWidth() * (this.getPyramidHeight() / 3);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Shape type = Square Pyramid"));
        result.append(super.toString());
        return result.toString();
    }
}
