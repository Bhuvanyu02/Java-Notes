import java.util.Arrays;

public class Two_String_arrays {
    public static void main(String[] args) {
        String[] word1 ={"ab","c"};
        String[] word2 ={"a","bc"};
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        int n=word1.length;
        for (int i=0;i<n;i++){
                s1.append(word1[i]);
        }
        for (int i=0;i<n;i++){
            s2.append(word2[i]);
        }
        if (s1.toString().equals(s2.toString())){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
