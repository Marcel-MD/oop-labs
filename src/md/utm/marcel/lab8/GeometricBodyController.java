package md.utm.marcel.lab8;

import java.util.List;

public class GeometricBodyController {

    public static GeometricBody biggestVolume(List<GeometricBody> bodies) {
        double maxVolume = 0;
        int bodyIndex = 0;

        for(int i = 0; i < bodies.size(); i++) {
            double volume = bodies.get(i).getVolume();
            if(volume > maxVolume) {
                maxVolume = volume;
                bodyIndex = i;
            }
        }

        return bodies.get(bodyIndex);
    }

    public static GeometricBody biggestSurface(List<GeometricBody> bodies) {
        double maxSurface = 0;
        int bodyIndex = 0;

        for(int i = 0; i < bodies.size(); i++) {
            double surface = bodies.get(i).getSurface();
            if(surface > maxSurface) {
                maxSurface = surface;
                bodyIndex = i;
            }
        }

        return bodies.get(bodyIndex);
    }
}
