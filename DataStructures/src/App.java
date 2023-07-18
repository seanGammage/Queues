public class App {

    // QUEUES - FIFO (First in, First out)
    // Just like a line at a store
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        System.out.println("Queue size is: " + queue.size());

        System.out.println("Front element: " + queue.peek());

        // while (!queue.isEmpty()) {
        //     queue.dequeue();
        // }

        queue.dequeue();

        System.out.println(" Queue size: " + queue.size());

    }
}
