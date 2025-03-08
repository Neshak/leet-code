public class MoveZeroes {

    public void move(int[] nums){
        int nonzero =0;

        for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonzero]=nums[i];
                nonzero++;
            }
        }

        while(nonzero<nums.length){
            nums[nonzero]=0;
            nonzero++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        MoveZeroes mvz = new MoveZeroes();

        mvz.move(nums);

    }
}