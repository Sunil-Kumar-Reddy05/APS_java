class StackArray {
    int[] stack;
    int top;
    int size;

    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = x;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class StackADT {
    public static void main(String[] args) {
        StackArray s1 = new StackArray(4);

        s1.push(10);
        s1.display();

        s1.push(20);
        s1.display();

        s1.push(30);
        s1.display();

        s1.push(40);
        s1.display();

        s1.push(50); // Overflow
        s1.display();

        System.out.println("Deleted element: " + s1.pop());
        s1.display();

        System.out.println("Deleted element: " + s1.pop());
        s1.display();

        System.out.println("Deleted element: " + s1.pop());
        s1.display();

        System.out.println("Deleted element: " + s1.pop());
        s1.display();

        System.out.println("Deleted element: " + s1.pop()); // Underflow
        s1.display();
    }
}
