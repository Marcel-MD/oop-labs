package md.utm.marcel.lab5;

public class E extends D{
    protected String e;

    public E(String a, X x) {
        super(a, x);
        this.e = a;
    }

    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", x=" + x.toString() +
                "}\n" + super.toString();
    }
}
