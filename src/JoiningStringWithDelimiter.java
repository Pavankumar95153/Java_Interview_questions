import java.util.StringJoiner;

public class JoiningStringWithDelimiter {
    public static void main(String[] args) {
        System.out.println(joinByDelimiter(' ',"Hello","Sai","Baba"));
    }
    public static String joinByDelimiter(char delimiter,String...args){
        StringJoiner stringJoiner = new StringJoiner(String.valueOf(delimiter));
        for(String arg:args){
            stringJoiner.add(arg);
        }
        return stringJoiner.toString();
    }
}

//o/p --> Hello Sai Baba