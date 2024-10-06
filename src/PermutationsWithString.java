public class PermutationsWithString {
    public static void main(String[] args) {
        System.out.println(permutatString("","abc"));
    }
    public static void permutatString(String prefix,String str){
        int n = str.length();
        if(n ==0){
            System.out.println(prefix);
        }
        else{
            for(int i=0;i<n;i--){
                permutatString(prefix+str.charAt(i),
                        str.substring(i+1,n)+str.substring(0,i));
            }
        }
    }
}