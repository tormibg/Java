package geometry.shapes.space;

import geometry.interfaces.AreaMeasurable;
import geometry.interfaces.VolumeMeasurable;
import geometry.shapes.Shape;
import geometry.vertex.Vertex3D;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    protected SpaceShape(Vertex3D vertices) {
        super(vertices);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString());
        result.append(String.format("\n  Area = %.2f", this.getArea()));
        result.append(String.format("\n  Volume = %.2f", this.getVolume()));

        return result.toString();
    }
}
