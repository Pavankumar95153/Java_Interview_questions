import java.util.stream.IntStream;

public class FindIntegerInString {
    public static void main(String[] args) {
//        System.out.println(findIntegerInStringJ8("SaiBaba"));
        System.out.println(containIntInString("SaiBaba1"));

    }
    public static boolean findIntegerInString(String str){
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean findIntegerInStringJ8(String str){
        boolean b = str.chars().anyMatch(e -> Character.isDigit(e));
        return b;
    }

    public static boolean containIntInString(String str){
        return str.matches("[0-9]+");
    }

    public static void test(String str){
        str.codePoints().forEach(e-> System.out.println(e));
    }
}