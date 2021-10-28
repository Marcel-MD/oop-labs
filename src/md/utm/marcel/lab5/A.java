package md.utm.marcel.lab5;

public class A {
    protected String a;
    protected X x = new X("xxx");

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", x=" + x.toString() +
                "}\n";
    }
}
