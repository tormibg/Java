/// Help from https://github.com/itcherokee/SoftUni/tree/master/OOP/08.OOP%20in%20Java/src/com/softuni/oop

package geometry;

import geometry.interfaces.VolumeMeasurable;
import geometry.shapes.Shape;
import geometry.shapes.plane.Circle;
import geometry.shapes.plane.PlaneShape;
import geometry.shapes.plane.Rectangle;
import geometry.shapes.plane.Triangle;
import geometry.shapes.space.Cuboid;
import geometry.shapes.space.Sphere;
import geometry.shapes.space.SquarePyramid;
import geometry.vertex.Vertex2D;
import geometry.vertex.Vertex3D;

import java.util.Arrays;

public class test1 {

    public static void main(String[] args) {

        Shape triangle = new Triangle(new Vertex2D(1, 1), new Vertex2D(1, 2), new Vertex2D(10.2, 33));
        Shape rect = new Rectangle(new Vertex2D(10, 10), 20, 10);
        Shape circle = new Circle(new Vertex2D(-10, 10), 10);
        Shape pyramid = new SquarePyramid(new Vertex3D(-7.2, 12, 10), 20, 29.1);
        Shape cuboid = new Cuboid(new Vertex3D(4.3, 2, -1), 10, 5, 3);
        Shape sphere = new Sphere(new Vertex3D(4.3, 22, -1), 1);

        Shape[] mathObjects = new Shape[]{triangle, rect, circle, pyramid, cuboid, sphere};

        System.out.println("**********************************************************");
        System.out.println("Only VolumeMeasurable shapes (with volume over 40.00 cm3):");
        System.out.println("**********************************************************");
        Arrays.stream(mathObjects)
                .filter(shape -> shape instanceof VolumeMeasurable)
                .map(shape -> (VolumeMeasurable) shape)
                .filter(shape -> shape.getVolume() > 40.00)
                .forEach(System.out::println);

        System.out.println("**************************************************");
        System.out.println("Only Plane shapes (sorted by perimeter ascending):");
        System.out.println("**************************************************");
        Arrays.stream(mathObjects)
                .filter(shape -> shape instanceof PlaneShape)
                .map(shape -> (PlaneShape) shape)
                .sorted((shapeOne, shapeTwo) -> Double.compare(shapeOne.getPerimeter(), shapeTwo.getPerimeter()))
                .forEach(System.out::println);
    }
}
