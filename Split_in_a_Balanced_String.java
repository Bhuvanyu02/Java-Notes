public class Split_in_a_Balanced_String {
    public static void main(String[] args) {
        String s="RLRRRLLRLL";
        int ans=0;
        int r=0;
        int l=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='R'){
                r++;
            }
            else {
                l++;
            }
            if (r==l){
                r=0;
                l=0;
                ans++;
            }
        }
        System.out.println(ans);

    }
}
