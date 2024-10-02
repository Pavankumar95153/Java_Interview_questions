import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReversingWord {
    public static void main(String[] args) {
        System.out.println(reverseStringByJ8("Sai Baba"));
    }
private static final String whiteSpace = " ";
    public static String reverseString(String str){
        String [] words = str.split(whiteSpace);
        StringBuilder reverseString = new StringBuilder();
        for(String word: words){
            StringBuilder reverseWord = new StringBuilder();
            for(int i=word.length()-1;i>=0;i--){
                reverseWord.append(word.charAt(i));
            }
            reverseString.append(reverseWord).append(whiteSpace);
        }
        return reverseString.toString();

    }

    public static String reverseStringByJ8(String str){
        String collect = Stream.of(str).map(e -> new StringBuilder(e).reverse())
                .collect(Collectors.joining());
        return collect;
    }
}