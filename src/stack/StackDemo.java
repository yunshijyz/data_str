package stack;

public class StackDemo {

    private int[] array;
    private int index;

    public StackDemo(int size) {
        this.array = new int[size];
    }

    //入栈
    public void push(int value) {
        if (index >= array.length) {
            throw new RuntimeException("栈满，不让加了");
        }
        array[index++] = value;
    }

    //出栈
    public int pop() {
        if (index <= 0) {
            throw new RuntimeException("栈空，不能取出");
        }
        return array[--index];
    }

    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo(5);
        stackDemo.push(1);
        stackDemo.push(2);
        stackDemo.push(3);
        stackDemo.push(4);
        stackDemo.push(5);


    }
}
