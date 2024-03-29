import java.util.Scanner;

public class Generic_Array_stack {

    public static final int MAX = 10;
    public static int top = -1;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Object S[] = new Object[MAX];

        while (true) {
            System.out.println("---> MENU <---");
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.print("Enter your Choice : ");
            int choice = sc.nextInt();

            switch(choice){
                case 0 : System.out.println("Exiting..."); System.exit(0);System.out.println("Exiting..."); break;
                case 1 : top = push(S); break;
                case 2 : top = pop(S); break;
                case 3 : display(S); break;
                default : System.out.println("Invalid Choice"); break;
            }
        }
    }

    public static int push(Object []arr) {
        if (top == MAX-1) {
            System.out.println("Stack is full");
        }
        System.out.print("Enter the element to be pushed : ");
        arr[++top] = (Object) sc.next();
        return top;
    }

    public static int pop(Object []arr) {
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        System.out.println(arr[top--] + " is Poped from the stack");
        return top;
    }

    public static void display(Object []arr) {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("---> " + arr[top]);
        for (int i=top-1 ; i>=0 ; i--) {
            System.out.println("     " + arr[i]);
        }
        System.out.println();
    }
}