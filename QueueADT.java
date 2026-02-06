public class QueueADT {
    int front, rear;
    int maxsize;
    int[] q;

    QueueADT(int size) {
        maxsize = size;
        q = new int[maxsize];
        front = -1;
        rear = -1;
    }

    void enqueue(int item) {
        if (rear == maxsize - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0; // first insertion
            }
            rear++;
            q[rear] = item;
            System.out.println(item + " inserted");
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(q[front] + " deleted");
            front++;
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue Elements:");
            for (int i = front; i <= rear; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueADT q1 = new QueueADT(5);
        q1.enqueue(10);
        q1.display();
        q1.enqueue(20);
        q1.display();
        q1.enqueue(30);
        q1.display();
        q1.enqueue(40);
        q1.display();
        q1.enqueue(50);
        q1.display();
    }
}
