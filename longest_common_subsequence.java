public class longest_common_subsequence {

    public static int countS(String s1,String s2,int k){
      int count=0;
      int i=k;
            for (int j=0;j<s1.length()&& i<s2.length();j++){
                if (s1.charAt(j)==s2.charAt(i)){
                    count++;
                    i++;
                }
            }
        return count;
    }

    public static void main(String[] args) {
        String s1="abcdefghij";
        String s2="cdxghij";
        int k=0;
        int maxcount=countS(s1,s2,k);
        int a=0;
        while (a<s2.length()){
            k++;
            a++;
          int count=countS(s1,s2,k);
          if (count>maxcount){
              maxcount=count;
          }
        }
        System.out.println(maxcount);
    }
}
