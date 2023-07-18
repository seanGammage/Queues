public class Queue {
    private static final int MAX_SIZE = 10;
    private int[] elements;
    private int front;
    private int rear;
    private int size;

    public Queue() {
        elements = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Engqueue Method
    public void enqueue(int element) {
        if (!isFull()) {
            rear = (rear + 1) % MAX_SIZE;
            elements[rear] = element;
            size++;
            System.out.println("Enqueued to back of the qeueue: " + element);
        } else {
            System.out.println("Queue is full. Cannot enqure the element: " + element);
        }
    }

    // Dequeue Method
    public int dequeue() {
        if (!isEmpty()) {
            int dequeuedElement = elements[front];
            front = (front + 1) % MAX_SIZE;
            size--;
            System.out.println("Dequeed: " + dequeuedElement);
            return dequeuedElement;
        } else {
            System.out.println("Queue is empty, nothing to remove");
            return -1; // throw an exception
        }
    }

    // isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    // isFull
    public boolean isFull() {
        return size == MAX_SIZE;
    }

    // size
    public int size() {
        return size;
    }

    public int peek() {
        if (!isEmpty()) {
            return elements[front];
        } else {
            System.out.println("Queue is empty, nothing to remove");
            return -1;
        }
    }
}
