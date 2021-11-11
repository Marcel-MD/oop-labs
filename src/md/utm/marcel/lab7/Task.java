package md.utm.marcel.lab7;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {

        System.out.println("\n# ==========  Task 1  ============ #");

        List<Figure> figures = new ArrayList<>();

        figures.add(new Square(4));
        figures.add(new Rectangle(3.5, 5));
        figures.add(new Triangle(7, 4, 7));

        Figure biggestAreaFigure = FigureController.biggestArea(figures);
        Figure biggestPerimeterFigure = FigureController.biggestPerimeter(figures);

        System.out.println(biggestAreaFigure);
        System.out.println(biggestPerimeterFigure);

        System.out.println("\n# ==========  Task 2  ============ #");

        Figure circle = new Figure() {
            private double r = 3;

            @Override
            public double getArea() {
                return Math.PI * r * r;
            }

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * r;
            }

            @Override
            public String toString() {
                return "Circle{" +
                        "r=" + r +
                        '}';
            }

        };

        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        figures.add(circle);
        biggestAreaFigure = FigureController.biggestArea(figures);
        System.out.println(biggestAreaFigure);
    }
}
