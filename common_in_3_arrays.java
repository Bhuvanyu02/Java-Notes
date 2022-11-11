public class common_in_3_arrays {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={2,4,6,7,8};
        int c[]={2,4,9,11,22};
    for (int i=0;i<5;i++){
        for (int j=0;j<5;j++){
            for (int k=0;k<5;k++){
                if(a[i]==b[j] && b[j]==c[k]){
                    System.out.println(a[i]);
                }
            }
        }
    }
    }
}
