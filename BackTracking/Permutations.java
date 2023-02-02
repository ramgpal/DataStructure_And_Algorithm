public class Permutations {
    public static  void Find_Permutations (String str,String ans) {
        if(str.length()==0)  {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char CurrChar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            Find_Permutations(newstr, ans+CurrChar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        Find_Permutations(str, "");
    }
    

}
//Time Complexity O(n*n!)
