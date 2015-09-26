package geometry.shapes.plane;

import geometry.vertex.Vertex;
import geometry.vertex.Vertex2D;

public class Triangle extends PlaneShape{
    public Triangle(Vertex2D vertices1, Vertex2D vertices2, Vertex2D vertices3) {
        super(vertices1);
        this.addVertex(vertices2);
        this.addVertex(vertices3);
    }

    @Override
    public double getArea() {
        double halfPerimeter =  getPerimeter() /2;
        double result = Math.sqrt(halfPerimeter * (halfPerimeter - getSideLength(this.getVertex(0), this.getVertex(1)))*
                                                  (halfPerimeter - getSideLength(this.getVertex(1), this.getVertex(2)))*
                                                  (halfPerimeter - getSideLength(this.getVertex(2), this.getVertex(0))));
        return result;
    }

    @Override
    public double getPerimeter(){
        double side1 = getSideLength(this.getVertex(0), this.getVertex(1));
        double side2 = getSideLength(this.getVertex(1), this.getVertex(2));
        double side3 = getSideLength(this.getVertex(2), this.getVertex(0));
        return side1 + side2 + side3;
    }


    private double getSideLength(Vertex vertex1, Vertex vertex2) {
        double xCord = Math.pow(vertex1.getX() - vertex2.getX(), 2);
        double yCord = Math.pow(vertex1.getY() - vertex2.getY(), 2);
        return Math.sqrt(xCord + yCord);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Shape type = Triangle"));
        result.append(super.toString());
        return result.toString();
    }
}
