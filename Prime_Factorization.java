import java.util.Scanner;

public class Prime_Factorization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            if(n%i==0){
                    boolean check=true;
                for (int j=2;j<i;j++){
                    if((i%j)==0){
                        check=false;
                    }
                    if (!check){
                        break;
                    }
                }
                if (check==true){
                    System.out.println(i);
                }
            }
        }


    }
}
