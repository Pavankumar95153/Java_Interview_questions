public class CertainCharInAString {
    public static void main(String[] args) {
        System.out.println( occurenceOfCharacter("SaiBaba",'a'));
    }
    public static int occurenceOfCharacterInString(String str,char ch){
        return str.length()-str.replace(String.valueOf(ch),"").length();
    }

    public static int occurenceOfCharacter(String str,char ch){
        int repeat= (int) str.chars().filter(c->c==ch).count();
        return repeat;
    }
}