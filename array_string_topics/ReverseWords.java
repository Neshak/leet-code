
import java.util.List;

public class ReverseWords {

    private String reverseWord(String word){
       StringBuffer sb = new StringBuffer();
       String[] words = word.trim().split("\\s+");

       for(int i = words.length-1;i>=0;i--){
        sb.append(words[i]);
        if(i!=0)
            sb.append(" ");
       }
       return sb.toString();
    }
    public static void main(String[] args) {
        String sen = "Hello world";

        ReverseWords reword = new ReverseWords();
        String word = reword.reverseWord(sen);
        System.out.println(word);
    }
}
