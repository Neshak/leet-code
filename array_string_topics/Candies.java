import java.util.Arrays;
import java.util.List;

public class Candies {

    List<Boolean> greatestNumberOfCandies(int[] candy, int extraCandies){
        int n = candy.length;
        Boolean[] resultCandies = new Boolean[n];
        Arrays.fill(resultCandies, false);

        int greatestNumberCandies = 0;
        for (int i = 0;i < n;i++) {
            if(candy[i]>greatestNumberCandies)
                greatestNumberCandies=candy[i];
        }

        for(int i=0;i<n;i++){
            if(candy[i]+extraCandies>=greatestNumberCandies)
                resultCandies[i]=true;
        }

        return Arrays.asList(resultCandies);
    }
    
    public static void main(String[] args) {
        int[] candy = {4,2,1,1,2};
        int extraCandies = 1;

        Candies candies = new Candies();

        List<Boolean> greatest = candies.greatestNumberOfCandies(candy, extraCandies);

        System.out.println(greatest);
    }
}