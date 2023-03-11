public class Knapsack_0_1 {
    public static void main(String[] args) {
        int[] val={100,60,120};
        int[] w={20,10,30};
        int n=w.length;
        int maxW=40;

        int maxans=0;
        for(int i=0;i<n;i++){
            int ans=0;
            int w1=0;
            if (w1+w[i]<=maxW) {
                w1 += w[i];
                ans += val[i];
            }
            if(ans>maxans){
                maxans=ans;
            }
            for (int j=i+1;j<n;j++){
               int ans2=ans;
               int w2=w1;
                if(w2+w[j]<=maxW){
                    w2+=w[j];
                    ans2+=val[j];
                }
                if(ans2>maxans){
                    maxans=ans2;
                }
            }
        }
        System.out.println(maxans);
    }
}
