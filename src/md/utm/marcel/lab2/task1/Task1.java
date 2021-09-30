package md.utm.marcel.lab2.task1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("//============  TASK 2  ===============//");
        Box box1 = new Box();
        Box box2 = new Box(13.0);
        Box box3 = new Box(34.3, 54.2, 76.1);

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        System.out.println("Box3 Area: " + box3.getArea());
        System.out.println("Box3 Volume: " + box3.getVolume());
    }
}
