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
import geometry.vertex.Vertex;
import geometry.vertex.Vertex2D;
import geometry.vertex.Vertex3D;

import java.util.Arrays;
import java.util.Random;


public class test2 {


    public static void main(String[] args) {

        Vertex[] vertices2D = new Vertex2D[30];
        Vertex[] vertices3D = new Vertex3D[30];

        for (int i = 0; i < 30; i++) { //random 2D vertices
            double x = new Random().nextInt(50) + 50;
            double y = new Random().nextInt(50) + 50;
            vertices2D[i] = new Vertex2D(x, y);
        }

        for (int i = 0; i < 30; i++) { //random 3D vertices
            double x = new Random().nextInt(50) + 50;
            double y = new Random().nextInt(50) + 50;
            double z = new Random().nextInt(50) + 50;
            vertices3D[i] = new Vertex3D(x, y, z);
        }

        Shape[] shapes = new Shape[60];
        for (int i = 0; i < 60; i += 6) {
            double width = new Random().nextInt(200) / 39 + 3;
            double height = new Random().nextInt(200) / 39 + 3;
            double depth = new Random().nextInt(200) / 39 + 3;
            double radius = new Random().nextInt(200) / 39 + 3;
            Vertex2D v2D1 = (Vertex2D) vertices2D[new Random().nextInt(10) + 10];
            Vertex2D v2D2 = (Vertex2D) vertices2D[new Random().nextInt(10) + 10];
            Vertex2D v2D3 = (Vertex2D) vertices2D[new Random().nextInt(10) + 10];
            Vertex3D v3D1 = (Vertex3D) vertices3D[new Random().nextInt(10) + 10];
            Vertex3D v3D2 = (Vertex3D) vertices3D[new Random().nextInt(10) + 10];
            Vertex3D v3D3 = (Vertex3D) vertices3D[new Random().nextInt(10) + 10];
            shapes[i] = new Triangle(v2D1, v2D2, v2D3);
            shapes[i + 1] = new Rectangle(v2D1, width, height);
            shapes[i + 2] = new Circle(v2D2, radius);
            shapes[i + 3] = new SquarePyramid(v3D1, width, height);
            shapes[i + 4] = new Cuboid(v3D2, width, height, depth);
            shapes[i + 5] = new Sphere(v3D3, radius);
        }
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }

        System.out.println("**********************************************************");
        System.out.println("Only VolumeMeasurable shapes (with volume over 40.00 cm3):");
        System.out.println("**********************************************************");
        Arrays.stream(shapes)
                .filter(shape -> shape instanceof VolumeMeasurable)
                .map(shape -> (VolumeMeasurable) shape)
                .filter(shape -> shape.getVolume() > 40.00)
                .forEach(System.out::println);

        System.out.println("**************************************************");
        System.out.println("Only Plane shapes (sorted by perimeter ascending):");
        System.out.println("**************************************************");
        Arrays.stream(shapes)
                .filter(shape -> shape instanceof PlaneShape)
                .map(shape -> (PlaneShape) shape)
                .sorted((shapeOne, shapeTwo) -> Double.compare(shapeOne.getPerimeter(), shapeTwo.getPerimeter()))
                .forEach(System.out::println);
    }


}
