package md.utm.marcel.lab7;

import java.util.List;

public class FigureController {

    public static Figure biggestArea(List<Figure> figures) {
        double maxArea = 0;
        int figureIndex = 0;

        for(int i = 0; i < figures.size(); i++) {
            double area = figures.get(i).getArea();
            if(area > maxArea) {
                maxArea = area;
                figureIndex = i;
            }
        }

        return figures.get(figureIndex);
    }

    public static Figure biggestPerimeter(List<Figure> figures) {
        double maxPerimeter = 0;
        int figureIndex = 0;

        for(int i = 0; i < figures.size(); i++) {
            double perimeter = figures.get(i).getPerimeter();
            if(perimeter > maxPerimeter) {
                maxPerimeter = perimeter;
                figureIndex = i;
            }
        }

        return figures.get(figureIndex);
    }
}
