package stack;

import java.util.Arrays;
import java.util.Stack;

//queue - FIFO - push/add- back, pop/remove - front
//stack - LIFO - push/add or pop/remove - top
//input_stack - push operation
//output_stack - reverse input stack - pop
public class QueueUsingStack {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public QueueUsingStack(){
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x){
        input.push(x);
    }

    public int pop(){
        peek();
        return output.pop();
    }

    public int peek(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty(){
        return input.isEmpty()&&output.isEmpty();
    }

    public static void main(String[] args){
        QueueUsingStack obj = new QueueUsingStack();
        int[] input = {1,2,3};
        for(int i: input){
        obj.push(i);
        }
        int param_1=obj.peek();
        int param_2=obj.pop();
        boolean param_3=obj.empty();

        System.out.println(Arrays.toString(input));
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);

    }
}
