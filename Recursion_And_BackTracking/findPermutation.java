public class findPermutation {
    public static void Find_Permutations(String str,String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++) {
            ans += str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            Find_Permutations(newStr, ans);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        Find_Permutations(str, " ");
    }
}
