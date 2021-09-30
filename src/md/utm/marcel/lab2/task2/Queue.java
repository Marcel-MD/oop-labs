package md.utm.marcel.lab2.task2;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private Integer size;
    private Integer maxSize;
    private List<T> queue;

    public Queue() {
        this.size = 0;
        this.maxSize = Integer.MAX_VALUE;
        this.queue = new ArrayList<>();
    }

    public Queue(Integer maxSize) {
        this.size = 0;
        this.maxSize = maxSize;
        this.queue = new ArrayList<>();
    }

    public void push(T value) {
        if(size < maxSize) {
            this.queue.add(value);
            this.size++;
        } else {
            System.out.println("The queue is full!");
        }
    }

    public T pop() {
        if(size == 0) {
            System.out.println("The queue is empty!");
            return null;
        } else  {
            this.size--;
            T value = queue.get(size);
            queue.remove(this.size);
            return value;
        }
    }

    public Boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

    public Boolean isFull() {
        if(size == maxSize) {
            return  true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "size=" + size +
                ", maxSize=" + maxSize +
                ", queue=" + queue +
                '}';
    }
}
