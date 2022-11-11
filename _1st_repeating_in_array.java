public class _1st_repeating_in_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,5};
        boolean ab=false;
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                if(a[i]==a[j] && !ab){
                    System.out.println(a[i]);
                    ab=true;
                }
            }
        }
    }
}
