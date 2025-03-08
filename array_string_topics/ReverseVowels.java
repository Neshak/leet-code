
import java.util.ArrayList;

public class ReverseVowels {

    private String reverseVowel(String input){
       char[] arr = input.toCharArray();
       ArrayList<Character> list = new ArrayList<>();

       for(int i=0;i<arr.length;i++){
        char c = arr[i];
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            list.add(c);
            arr[i]='\0';
        }
       }
       int len = list.size()-1;
       for(int i=0; i<arr.length;i++){
            if(arr[i]=='\0'){
                arr[i] = list.get(len);
                len--;
            }
       }

       return new String(arr);

    }
    public static void main(String[] args){
        String input = "IceCreAm";
        ReverseVowels reverse = new ReverseVowels();
        String s = reverse.reverseVowel(input);
        System.out.println(s);
    }
}
