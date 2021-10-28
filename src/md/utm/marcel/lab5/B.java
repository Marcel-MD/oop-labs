package md.utm.marcel.lab5;

public class B extends A {
    protected String b;

    public B(String a, X x) {
        super(a, x);
        this.b = a;
    }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", x=" + x.toString() +
                "}\n" + super.toString();
    }
}
