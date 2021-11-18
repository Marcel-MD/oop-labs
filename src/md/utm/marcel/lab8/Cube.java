package md.utm.marcel.lab8;

public class Cube implements GeometricBody {

    private double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double getSurface() {
        return 6 * a * a;
    }

    @Override
    public double getVolume() {
        return a * a * a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Cub{" +
                "a=" + a +
                '}';
    }
}
