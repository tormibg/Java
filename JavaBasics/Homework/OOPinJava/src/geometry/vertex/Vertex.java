package geometry.vertex;

public class Vertex {
    private double x;
    private double y;

    public Vertex(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%s,%s",this.getX(), this.getY());
    }
}

