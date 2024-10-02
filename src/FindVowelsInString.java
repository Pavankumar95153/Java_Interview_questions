import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindVowelsInString {
    public static void main(String[] args) {
        System.out.println(countTheVowelsAndConsonants("SaiBaba"));
    }
    private  static final Set<Character> allvowels = new HashSet(Arrays.asList('a','e','i','o','u'));

    public static Map<Long,Long> countTheVowelsAndConsonants(String str){
        str = str.toLowerCase();
        long count = str.chars().filter(c -> allvowels.contains((char) c)).count();
        long count1 = str.chars().filter(c -> !allvowels.contains((char) c))
                .filter(ch->(ch>='a'&&ch<'z')).count();
        return Map.of(count,count1);
    }
}