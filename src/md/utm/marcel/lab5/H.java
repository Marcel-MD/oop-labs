package md.utm.marcel.lab5;

public class H extends G{
    protected String h;
    private X x = new X("xhhh");

    public H(String a, X x) {
        super(a, x);
        this.h = a;
    }

    @Override
    public String toString() {
        return "H{" +
                "h='" + h + '\'' +
                ", x=" + x.toString() +
                "}\n" + super.toString();
    }
}
