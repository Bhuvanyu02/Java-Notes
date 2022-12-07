import java.util.Scanner;

public class Dec_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String pat=sc.next();

        String s=pat+"$"+str;

        int[] arr=new int[s.length()];
        int max=0;
        int n=s.length();
        arr[0]=0;
        for(int i=1;i<n;i++){
            int a=0;
            int ans=0;
            int j=i;
            while(j<n){
                    if(s.charAt(j)==s.charAt(a)){
                        ans++;
                        a++;
                        j++;
                    }
                    else{
                        break;
                    }
                }
            arr[i]=ans;
            if(ans>max){
                max=ans;
            }
        }
        System.out.println("Index value is "+max);
        for (int i=max-pat.length();i<max;i++){
            System.out.print(s.charAt(i));
        }






        }
    }




