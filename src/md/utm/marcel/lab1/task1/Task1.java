package md.utm.marcel.lab1.task1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("\n//============ TASK 1 ============//\n");

        Monitor firstMonitor = new Monitor(Color.BLACK, 48.5, 24.9, Resolution.HD);

        firstMonitor.setResolution(Resolution.FHD);
        firstMonitor.setColor(Color.WHITE);

        Monitor secondMonitor = new Monitor(Color.GRAY, 36.0, 24.0, Resolution.QHD);

        System.out.println(firstMonitor);
        System.out.println(secondMonitor);
        boolean areEqual = secondMonitor.equals(firstMonitor);
        System.out.println("Are equal: " + areEqual);
    }
}
