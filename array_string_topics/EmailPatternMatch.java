import java.util.regex.Pattern;

public class EmailPatternMatch {
    public static boolean isValid(String str){
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(str).matches();
    }
    public static void main(String[] args) {
        System.out.println(isValid("test@gmail.com"));
        System.out.println(isValid("invalid@domain"));
    }
}