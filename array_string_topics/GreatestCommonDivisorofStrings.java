
import java.util.logging.Logger;

public class GreatestCommonDivisorofStrings {

    private static final Logger logger = Logger.getLogger(GreatestCommonDivisorofStrings.class.getName());
   
   public String gcdOfString(String str1, String str2){
        if(!(str1+str2).equals(str2+str1))
            return "";
        
        int gcd = gcd(str1.length(),str2.length());
        int newGcd = gcdAtlernative(str1.length(), str2.length());
        return str1.substring(0,gcd);
   }

   //brute-force
   private int gcd(int len1, int len2){
        int gcd =1;
        for(int i=1; i<=Math.min(len1,len2);i++){
            if(len1%i==0 && len2%i==0)
                gcd =i;
        }
        return gcd;
   }

   //Euclidean Algorithm
   private int gcdAtlernative(int len1, int len2){
    if(len2==0)
        return len1;
    return gcdAtlernative(len2, len1%len2);
    }
   
    public static void main(String[] args){
        String str1 = "ABABAB";
        String str2 = "ABAB";

        GreatestCommonDivisorofStrings gcd = new GreatestCommonDivisorofStrings();

        String result = gcd.gcdOfString(str1, str2);
        logger.info(result);
    }
}
