public class nov_28 {
    public static void name(String txt, String pat){
        int n=txt.length();
        int m=pat.length();
        boolean flag=false;
        for(int i=0;i<n-m;i++){
            int j=0;
            for(;j<m;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
                if(j==m){
                    System.out.println("Pattern found at index "+ i);
                    flag=true;
                }
            }
        if(!flag)

        {
            System.out.println("Not Found");
        }

    }
    public  static void LPS(String pat,int m,int[]lps){
        int len=0;
        int i=1;
        lps[0]=0;
        while(i<m){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=len;
                    i++;
                }
            }
        }
    }

    public static void KMP(String txt,String pat){

        int n=txt.length();
        int m=pat.length();
        int lps[]=new int [m];
        int i=0;
        int j=0;
        boolean flag=false;
        LPS(pat,m,lps);
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                flag=true;
                System.out.println("Pattern found at "+(i-j));
            }
            else if(i<n&& pat.charAt(j)!=txt.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i+=1;
                }
            }
        }
        if(!flag){
            System.out.println("not found");
        }



    }
   public static void main(String[] args) {
    // STRING : PATTERN MATCHING, SEARCHING, SORTING
        //     PATTERN MATCHING -> KMP (KNUTH MORRIS PRATT)

       String txt ="ababcabcaabababd";
       String pat ="ababd";
       KMP(txt, pat);

//        name("dabcd","abc");
    }
}
