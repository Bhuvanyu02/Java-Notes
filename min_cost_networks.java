public class min_cost_networks {

    public static int min_cost_path(int[][] cost_matrix,int M,int N){
        int [][]temp=new int[M][N];
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                temp[i][j]=cost_matrix[i][j];
                // first row
                if (i==0 &&j>0){
                    temp[0][j]+=temp[0][j-1];
                }
                //first column
               else if (j==0 &&i>0){
                    temp[i][0]+=temp[i-1][0];
                }
                else if(i>0&&j>0){
                    temp[i][j]+=Math.min(temp[i-1][j],temp[i][j-1]);
                }

            }
        }
    return temp[M-1][N-1];
    }

    public static void main(String[] args) {
        int[][] cost_matrix={{1,3,1},{2,3,2},{4,3,1}};
        int M= cost_matrix.length;
        int N= cost_matrix[0].length;
        int cost=min_cost_path(cost_matrix,M,N);
        System.out.println(cost);
    }
}
