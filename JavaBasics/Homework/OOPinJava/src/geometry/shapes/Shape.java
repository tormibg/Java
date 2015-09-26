package geometry.shapes;

import geometry.vertex.Vertex;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    private List<Vertex> vertices;

    protected Shape(Vertex newVertices) {
        this.vertices = new ArrayList<Vertex>();
        this.addVertex(newVertices);
    }

    protected void addVertex(Vertex vertives){
        this.vertices.add(vertives);
    }
    protected Vertex getVertex(int n){
        return this.vertices.get(n);
    }

    @Override
    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append("\n  Vertices :");
        for (Vertex vertex : this.vertices) {
            result.append(String.format("%s",vertex));
        }
        return result.toString();
    }
}
