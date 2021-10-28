package md.utm.marcel.lab5;

public class G extends F{
    protected String g;

    public G(String a, X x) {
        super(a, x);
        this.g = a;
    }

    @Override
    public String toString() {
        return "G{" +
                "g='" + g + '\'' +
                ", x=" + x.toString() +
                "}\n" + super.toString();
    }
}
