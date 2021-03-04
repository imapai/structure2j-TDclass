package base.stack;

/**
 * Create By chengming on 2020/3/24 17:27
 */
public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());

        System.out.println(myStack.isEmpty());
    }
}
