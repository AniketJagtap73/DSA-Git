
public class Stack{
        public static void main(String[] args){

            stack1 s = new stack1();
            s.push(6);
            s.push(8);
            s.push(10);
            s.push(11);
             System.out.println( s.isFull());
             System.out.println("top of the stack is " + s.top());
             System.out.println("size of the stack is " + s.Size());
             System.out.println( s.isEmpty());
             System.out.println( s.pop());
        }
}
    class stack1 {
        int size = 4;
        int arr[] = new int[size];
        int top = -1;

        void push(int x) {
            top++;
            arr[top] = x;
        }
        int pop() {
            int x = arr[top];
            top--;
            return x;
        }
        int Size() {
            return top + 1;
        }
        int top() {
            return arr[top];
        }
        boolean isEmpty() {
            return top == -1;
        }
        boolean isFull(){
            return  top == size-1;
        }
    }