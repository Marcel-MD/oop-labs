package md.utm.marcel.lab5;

public class F extends E{
    protected String f;

    public F(String a, X x) {
        super(a, x);
        this.f = a;
    }

    @Override
    public String toString() {
        return "F{" +
                "f='" + f + '\'' +
                ", x=" + x.toString() +
                "}\n" + super.toString();
    }
}
