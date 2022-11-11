public class array_is_subset {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={2,3,1};
        int count=0;
        int n=a.length;
        for (int i=0;i<n;i++){
            for(int j=0;j<b.length;j++) {
                if (a[i] == b[j]) {
                    count++;
                }
            }
        }
        if(count==b.length){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
