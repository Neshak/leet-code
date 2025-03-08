import java.util.logging.Logger;

public class MergeStringAlternative{
    private static final Logger logger = Logger.getLogger(MergeStringAlternative.class.getName());

    public String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        StringBuilder result = new StringBuilder();

        int i=0;
        for(;i<Math.min(word1Length, word2Length);i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        if(word1Length<word2Length)
            result.append(word2.substring(i));
        else
            result.append(word1.substring(i));

        return result.toString();
    }

    public static void main(String[] args){
        String firstWord = "Hello"; 
        String secondWord = "World";

        MergeStringAlternative alter =  new MergeStringAlternative();

        String result = alter.mergeAlternately(firstWord, secondWord);
        logger.info(result);
    }
}