package md.utm.marcel.lab5;

public class J extends I{
    protected String j;

    public J(String a, X x) {
        super(a, x);
        this.j = a;
    }

    @Override
    public String toString() {
        return "J{" +
                "j='" + j + '\'' +
                "}\n" + super.toString();
    }
}
