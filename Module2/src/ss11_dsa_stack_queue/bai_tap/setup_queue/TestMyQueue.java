package ss11_dsa_stack_queue.bai_tap.setup_queue;


public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);
        System.out.println("Dequeue: " + myQueue.dequeue().data);
    }
}
