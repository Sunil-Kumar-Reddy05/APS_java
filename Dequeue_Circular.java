public class Dequeue_Circular {
    int front, rear;
    int maxsize;
    int[] q;

    Dequeue_Circular(int size) {
        maxsize = size;
        q = new int[maxsize];
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return (front == (rear + 1) % maxsize);
    }

    boolean isEmpty() {
        return (front == -1);
    }

    void insertFront(int x) {
        if (isFull()) {
            System.out.println("Deque is Full");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + maxsize) % maxsize;
        }

        q[front] = x;
    }

    void insertRear(int x) {
        if (isFull()) {
            System.out.println("Deque is Full");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % maxsize;
        }

        q[rear] = x;
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % maxsize;
        }
    }

    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            rear = (rear - 1 + maxsize) % maxsize;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }

        int i = front;
        System.out.print("Deque: ");
        while (true) {
            System.out.print(q[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % maxsize;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Dequeue_Circular dq = new Dequeue_Circular(5);

        dq.insertRear(10);
        dq.display();
        dq.insertRear(20);
        dq.display();
        dq.insertFront(50);
        dq.display();
        dq.insertFront(30);
        dq.display();
        dq.insertFront(40);
        dq.display();
        dq.deleteFront();
        dq.display();
        dq.deleteRear();
        dq.display();
    }
}
