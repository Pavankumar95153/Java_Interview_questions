import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class non_repeatedChar {
    public static void main(String[] args) {
//        System.out.println(firstNonRepeatedChar("SaiBaba"));
        System.out.println(firstNonRepeatedCharJ8("SaiBaba"));
    }

    public static char firstNonRepeatedChar(String str){
        Map<Character,Integer> chars = new LinkedHashMap<>();
        for (char ch: str.toCharArray()){
            chars.compute(ch,(k,v)->(v==null)?1:++v);
        }
        for (Map.Entry<Character,Integer> entry: chars.entrySet()){
            if(entry.getValue()==1){
               return entry.getKey();
            }
        }
        return Character.MIN_VALUE;

    }

    public static String firstNonRepeatedCharJ8(String str){
        LinkedHashMap<Integer, Long> collect = str.chars().mapToObj(c -> c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
        Integer cp = collect.entrySet().stream().filter(e -> e.getValue() == 1L).findFirst()
                .map(Map.Entry::getKey).orElse(Integer.valueOf(Character.MIN_VALUE));
        return String.valueOf(Character.toChars(cp));
    }
}