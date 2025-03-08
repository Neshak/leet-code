public class StringCompression {
    
    public int compress(char[] chars){
        StringBuilder sb = new StringBuilder();
        int i=0;

        while(i<chars.length){
            char c = chars[i];
            int count=0;
            
            while(i<chars.length&&chars[i]==c){
                count++;
                i++;
            }

            sb.append(c);

            if(count>1)
                sb.append(count);
        }

        for(int j=0; i<sb.length();i++){
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};

        StringCompression sc = new StringCompression();
        sc.compress(chars);
        }
}
