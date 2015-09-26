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

public class test3 {


    public static void main(String[] args) {
        System.out.println("All shapes in colection.\n");
        Shape[] shapeCollection = new Shape[6];
        shapeCollection[0] = new Triangle(new Vertex2D(1, -7), new Vertex2D(3, 11), new Vertex2D(20, 30));
        shapeCollection[1] = new Circle(new Vertex2D(122, -17), 13);
        shapeCollection[2] = new Rectangle(new Vertex2D(10, -70), 3, 22);
        shapeCollection[3] = new SquarePyramid(new Vertex3D(1, -7, 3), 1, 2);
        shapeCollection[4] = new Cuboid(new Vertex3D(1, -7, 3), 11, 20, 30);
        shapeCollection[5] = new Sphere(new Vertex3D(97, -12, 3), 50);

        for (Shape shape : shapeCollection) {
            System.out.println(shape);
            System.out.println();
        }

        System.out.println("**********************************************************");
        System.out.println("Only VolumeMeasurable shapes (with volume over 40.00 cm3):");
        System.out.println("**********************************************************");
        Arrays.stream(shapeCollection)
                .filter(shape -> shape instanceof VolumeMeasurable)
                .map(shape -> (VolumeMeasurable) shape)
                .filter(shape -> shape.getVolume() > 40.00)
                .forEach(System.out::println);

        System.out.println("**************************************************");
        System.out.println("Only Plane shapes (sorted by perimeter ascending):");
        System.out.println("**************************************************");
        Arrays.stream(shapeCollection)
                .filter(shape -> shape instanceof PlaneShape)
                .map(shape -> (PlaneShape) shape)
                .sorted((shapeOne, shapeTwo) -> Double.compare(shapeOne.getPerimeter(), shapeTwo.getPerimeter()))
                .forEach(System.out::println);
    }

}
