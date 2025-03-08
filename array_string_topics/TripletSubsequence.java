public class TripletSubsequence {
    
    public boolean increasingTriplet(int[] nums){
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;

        if(nums.length<3)
            return false;

        for(int n: nums){
            if(n<=max1) max1=n;
            else if(n <= max2) max2=n;
            else return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5};

        TripletSubsequence seq = new TripletSubsequence();
        seq.increasingTriplet(num);
    }
}
