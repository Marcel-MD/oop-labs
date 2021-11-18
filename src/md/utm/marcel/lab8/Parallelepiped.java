package md.utm.marcel.lab8;

public class Parallelepiped implements GeometricBody {

    private double a;
    private double b;
    private double c;

    public Parallelepiped(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSurface() {
        return 2 * a * b + 2 * b * c + 2 * a * c;
    }

    @Override
    public double getVolume() {
        return a * b * c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
