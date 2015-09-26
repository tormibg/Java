package geometry.shapes.plane;

import geometry.interfaces.AreaMeasurable;
import geometry.interfaces.PerimeterMeasurable;
import geometry.shapes.Shape;
import geometry.vertex.Vertex;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable{
    protected PlaneShape(Vertex newVertices) {
        super(newVertices);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString());
        result.append(String.format("\n  Perimeter = %.2f", this.getPerimeter()));
        result.append(String.format("\n  Area = %.2f", this.getArea()));
        return result.toString();
    }
}
