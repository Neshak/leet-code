public class ReverseWords {

    //reverse word by word
    public String reverseWord(String word){
       StringBuilder sb1 = new StringBuilder();
       String[] words = word.trim().split("\\s+");

       for(int i = words.length-1;i>=0;i--){
        sb1.append(words[i]);
        if(i!=0)
            sb1.append(" ");
       }
       return sb1.toString();
    }

    //reverse char by char
    public String reverseOneByOne(String word){
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    } 
    public static void main(String[] args) {
        String sen = "Hello world";

        ReverseWords reword = new ReverseWords();
        String word = reword.reverseWord(sen);
        String word2 = reword.reverseOneByOne(sen);
        System.out.println(word);
        System.out.println(word2);
    }
}
