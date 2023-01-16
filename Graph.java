
// G(V,E)  -> vertices and edges
// Types of Graphs - Null, Trivial, Directional and Non-Directional, Weighted
// weights -> distance or number of hops between stations

public class Graph {
    public static void main(String[] args) {

        int n=5;
        int[][] arr={
                {0,1,0,1,0},
                {0,0,0,0,1},
                {0,0,0,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0}
        };

        int min;
        int sum=0;
        int b=2;

        int i=0;
        int j=0;
        int hit=0;
        int hit1=0;
        while (arr[i][b]==0) {
            if (j>n-1 || i>n-1){
                j=hit+1;
                i=0;
                sum=0;
            }
            else if (arr[i][j]==0){
                j++;
            }
            else if(arr[i][j]!=0){
                if (hit==0){
                    hit=j;
                    hit1=hit;
                }
                sum+=arr[i][j];
                i=j;
            }
        }
        sum+=arr[i][b];
        min=sum;

        sum=0;
        i=0;
        j=hit1+1;
        while (arr[i][b]==0) {
            if (j>n-1 || i>n-1){
                j=hit+1;
                i=0;
                sum=0;
            }
            else if (arr[i][j]==0){
                j++;
            }
            else if(arr[i][j]!=0){
                if (hit==0){
                    hit=j;
                }
                sum+=arr[i][j];
                i=j;
            }
        }
        sum+=arr[i][b];
        if (sum<min){
            min=sum;
        }
        System.out.println(min);
    }
}
