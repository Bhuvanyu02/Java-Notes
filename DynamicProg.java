import java.util.HashMap;

public class DynamicProg {
    public static int recursion(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        for (int i=1;i<=n;i++) {
            dp[i] = 1 + dp[i - 1];

            if (n % 2 == 0) {
                dp[i] = Math.min(1+dp[i/2], dp[i]);
            }
            if (n % 3 == 0) {
                dp[i] = Math.min(1+dp[i/3], dp[i]);
            }
        }
        return dp[n]-1;
    }

    public static int recursion_min_step(int n){
        if(n<=1){
            return 0;
        }
        int result=recursion(n-1);
        if(n%2==0){
            result=Math.min(recursion(n/2),result);
        }
        if(n%3==0){
            result=Math.min(recursion(n/3),result);
        }
        return result+1; // minimum number of steps to reduce n to 1
    }

    public static HashMap<Integer,Integer>data=new HashMap<>();
 //   public static int calls=0;
    public static int stairs(int n){
      //  calls+=1;
        if(data.get(n)!=null){
            return data.get(n);
        }
        if (n<=0){
            return 1;
        }
        int result = stairs(n-1);
        if (n>=2){
            result+=stairs(n-2);
        }
        if (n>=3){
            result+=stairs(n-3);
        }
        data.put(n,result);
        return data.get(n);
    }

    public static void main(String[] args) {
        System.out.println(stairs(10));
     //   System.out.println(calls);
    }
}
