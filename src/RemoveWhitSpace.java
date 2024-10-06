public class RemoveWhitSpace {
    public static void main(String[] args) {
        System.out.println(removeSpace("Sai Baba"));
    }
    public static String removeSpace(String str){
             return  str.replaceAll("\\s","");
    }

}