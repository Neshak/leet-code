package stack;

import java.util.Arrays;
import java.util.Stack;

public class LrgRecHistogram_2 {
    public int largestRectangleArea(int[] heights){
        int n = heights.length;
        int[] left = new int[n];        
        int[] right = new int[n];  
        Stack<Integer> s = new Stack<>();
        
        //Right smaller
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            right[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }

        s.clear(); // clear stack

        //left smaller
        for(int i=0; i<n; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            left[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        int ans =0;
        for(int i = 0 ; i< n ;i++){
            int width = right[i] - left[i] -1;
            int currArea = heights[i] * width;
            ans = Math.max(ans, currArea);
        }

        return ans;
    }

    public static void main(String[] args) {
        LrgRecHistogram_2 largest = new LrgRecHistogram_2();
        int[] heights = {2,1,5,6,2,3};

        System.out.println("Heights: "+ Arrays.toString(heights));
        System.out.println("Largest Rectangle area: "+largest.largestRectangleArea(heights));
    }
}
