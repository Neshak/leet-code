package stack;

import java.util.Arrays;
import java.util.Stack;

public class MinStack {
    Stack<Integer> input;
    int min = Integer.MAX_VALUE;

    public MinStack(){
        input = new Stack();
    }

    public void push(int val){
        if(val<=min){
            input.push(min);
            min=val;
        }
        input.push(val);
    }

    public void pop(){
        if(input.pop()==min){
           min=input.pop();
        }
    }

    public int top(){
        return input.peek();
    }

    public int getMin(){
        return min;
    }

    public static void main(String[] args){
        MinStack obj = new MinStack();
        int[] nums = {-2,0,-3};

        for(int i:nums){
            obj.push(i);
        }
        System.out.print(Arrays.toString(nums)+"->");
        System.out.print("min : "+ obj.getMin()+"->");
        obj.pop();
        System.out.print("pop ->");
        obj.pop();
        System.out.print("pop ->");
        System.out.print("top : "+ obj.top()+"->");
        System.out.print("min"+obj.getMin());
    }
}
