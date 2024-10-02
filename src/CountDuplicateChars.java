import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateChars {
    public static void main(String[] args) {
        System.out.println(countDuplicateValues("SaiBaba"));
    }

    public static Map<Character,Integer> countDuplicateValues(String str){
        Map<Character,Integer> result = new HashMap<>();
        for(char ch:str.toCharArray()){
            result.compute(ch,(k,v)->(v==null)?1:++v);
        }
        return result;
    }

    public static Map<Character, Long> countDuplicateValByJ8(String str){
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
   return collect;
    }
}

//o/p--> {a=3, b=1, B=1, S=1, i=1}