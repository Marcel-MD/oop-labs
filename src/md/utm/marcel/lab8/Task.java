package md.utm.marcel.lab8;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {

        List<GeometricBody> bodies = new ArrayList<>();

        bodies.add(new Cube(4));
        bodies.add(new Parallelepiped(3.6, 4.7, 4));
        bodies.add(new Sphere(2.8));

        GeometricBody biggestSurfaceBody = GeometricBodyController.biggestSurface(bodies);
        GeometricBody biggestVolumeBody = GeometricBodyController.biggestVolume(bodies);

        System.out.println("Biggest surface: " + biggestSurfaceBody);
        System.out.println("Biggest volume: " + biggestVolumeBody);
    }
}
