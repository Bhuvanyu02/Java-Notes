public class remove_duplicates {
    public static void main(String[] args) {
        String s="abbaca";
        int n=s.length();
        char[] stk=new char[n];
        int c=0;
        for (int i=0;i<n;i++){
            char curr=s.charAt(i);
            if (c>0 && stk[c-1]==curr){
                c--;
            }
            else{
                stk[c]=curr;
                c++;
            }
        }
        System.out.println(new String(stk,0,c));
    }
}
