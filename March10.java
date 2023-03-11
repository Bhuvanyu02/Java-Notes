import java.util.Scanner;

public class March10 {
    public static void main(String[] args) {
        //      ROBIN KARP  uses ASCII values opposite to character
        // a--> 97

        // Text --> a  a a a b
        // n=6
        // Pattern -> a a b

        // let   a-->1 , b--> 2, c--> 3

        // STEP  i ->  convert every character to its ASCII value
        // ii -> generate a hash function for pattern
        // h(p) --> 1+1+2=4  ( assume hash function -->  sum of all ascii values in pattern)
        // iii  SLiding Window (By 1 step)
        //  if window sum == h(p) --> match characters of window with pattern
        // if pattern is matched else move on.


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String text=sc.next();
        System.out.println("Enter Pattern");
        String pattern=sc.next();
        int n=text.length();
        int m=pattern.length();
        long hash=0;
        for (int i=0;i<m;i++){
            int a=pattern.charAt(i);
            hash+=a;
        }
        int sum=0;
        for (int i=0;i<m;i++){
            int b=text.charAt(i);
            sum+=b;
        }
        boolean check=false;
        for (int i=0;i<n-m;i++){
            if (sum==hash){
                int k=0;
                for (int j=i;j<i+m;j++){
                    if (text.charAt(j)==pattern.charAt(k)){
                        k++;
                        if (k==m-1){
                            check=true;
                            break;
                        }
                    }
                    else {
                        k=0;
                        break;
                    }
                }
                if (check==true){
                    break;
                }
            }
            else{
                int a=text.charAt(i);
                sum-=a;
                int b=text.charAt(i+m);
                sum+=b;
            }
        }


        if (check==true){
            System.out.println("Pattern Found");
        }
        else{
            System.out.println("Pattern Not Found");
        }

    }
}
