package ss11_dsa_stack_queue.bai_tap.setup_queue;

public class MyQueue {
    private Node front;
    private Node rear;

    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = temp;
            this.rear.next = front;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
        this.rear.next = this.front;
    }

    public Node dequeue() {
        if (this.front == null)
            return null;
        else if (this.front == this.rear) {
            Node temp = this.front;
            this.front = this.rear = null;
            return temp;
        }
        Node temp = this.front;
        this.front = this.front.next;
        this.rear.next = this.front;
        return temp;

    }

}



