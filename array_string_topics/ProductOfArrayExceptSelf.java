public class ProductOfArrayExceptSelf {

    private int[] productExceptSelf(int[] nums){
       int prefixProduct =1;
       int suffixProduct =1;
       int[] result = new int[nums.length];

       for(int i=0;i<nums.length;i++){
        result[i]=prefixProduct;
        prefixProduct*=nums[i];
       }

       for(int i=nums.length-1;i>=0;i--){
        result[i] *=suffixProduct;
        suffixProduct*=nums[i];
       }

       return result;
    }


    public static void main(String[] args){
        int[] num ={1,2,3,4};

        ProductOfArrayExceptSelf self = new ProductOfArrayExceptSelf();

        int[] result = self.productExceptSelf(num);
    }
}
