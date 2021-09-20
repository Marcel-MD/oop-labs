package md.utm.marcel.lab1.task1;

enum Color {
    GRAY,
    BLACK,
    WHITE,
    BLUE,
    RED,
    GREEN,
    YELLOW,
}

enum Resolution {
    SD,
    HD,
    FHD,
    QHD,
    UHD,
}

public class Monitor {
    private Color color;
    private Double width;
    private Double height;
    private Resolution resolution;

    public Monitor(Color color, Double width, Double height, Resolution resolution) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.resolution = resolution;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "color=" + color +
                ", width=" + width +
                ", height=" + height +
                ", resolution=" + resolution +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monitor monitor = (Monitor) o;

        if (color != monitor.color) return false;
        if (width != null ? !width.equals(monitor.width) : monitor.width != null) return false;
        if (height != null ? !height.equals(monitor.height) : monitor.height != null) return false;
        return resolution == monitor.resolution;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (resolution != null ? resolution.hashCode() : 0);
        return result;
    }
}
