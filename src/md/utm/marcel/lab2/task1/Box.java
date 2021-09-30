package md.utm.marcel.lab2.task1;

public class Box {
    private Double height;
    private Double width;
    private Double depth;

    public Box() {
        this.height = 1.0;
        this.width = 1.0;
        this.depth = 1.0;
    }

    public Box(Double length) {
        this.height = length;
        this.width = length;
        this.depth = length;
    }

    public Box(Double height, Double width, Double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Double getVolume() {
        return width * height * depth;
    }

    public Double getArea() {
        return 2 * width * height + 2 * width * depth + 2 * height * depth;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
