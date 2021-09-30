package md.utm.marcel.lab2.task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("//============  TASK 2  ===============//");
        Queue<Integer> queue1 = new Queue<>();
        Queue<Integer> queue2 = new Queue<>(3);

        queue1.push(3);
        queue1.push(2);
        queue1.push(7);

        System.out.println(queue1);
        System.out.println("Queue1: isEmpty " + queue1.isEmpty() + " isFull " + queue1.isFull());
        System.out.println(queue1.pop());

        System.out.println();
        System.out.println("Queue2: isEmpty " + queue2.isEmpty() + " isFull " + queue2.isFull());

        queue2.push(9);
        queue2.push(5);
        queue2.push(8);
        queue2.push(0);

        System.out.println(queue2);
        System.out.println("Queue2: isEmpty " + queue2.isEmpty() + " isFull " + queue2.isFull());
        System.out.println(queue2.pop());
    }
}
