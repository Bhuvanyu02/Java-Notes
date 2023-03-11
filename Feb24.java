import java.util.Arrays;

public class Feb24 {
    public static void main(String[] args) {
        // Two Pointer (Reversing String)
//        String str="hemlo";
//        char ch[]=str.toCharArray();
//        int i=0;
//        int j=str.length()-1;
//        while (i<j){
//            char t=ch[i];
//            ch[i]=ch[j];
//            ch[j]=t;
//            i++;j--;
//        }
    //    System.out.println(ch);

        String str="hemlo";
        char ch[]=str.toCharArray();
        int i=0;
        int n=str.length();
        int[] freq=new int[n];


        Arrays.sort(ch);

        for (i=0;i<n;i++){
            int count =1;
            while (i<n-1 && ch[i]==ch[i+1]){
                i++;count++;
            }
         //   System.out.println(ch[i]+"->"+count);
        }




//        int count;
//        for (i=0;i<n;i++){
//            freq[i]=1;
//            for (int j=i+1;j<n;j++){
//                if (ch[i]==ch[j]){
//                    freq[i]+=1;
//                    j++;
//                    ch[j]='0';
//                }
//            }
//        }
//        for (i=0;i<n;i++){
//            if (ch[i]!=' ' && ch[i]!='0'){
//                System.out.println(ch[i]+"->"+freq[i]);
//            }
//        }





        

    }

}
