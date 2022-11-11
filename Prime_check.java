import java.util.Scanner;

public class Prime_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        boolean check=true;
//        for (int i=2;i<n/2;i++){
//            if(n%i==0 && check){
//                check=false;
//            }
//            if (!check) {
//                break;
//            }
//        }
//        if (check){
//            System.out.println("YES Prime");
//        }
//        else {
//
//            System.out.println("NO NOT PRIME");
//        }




        String s=sc.nextLine();
        StringBuilder s1=new StringBuilder();
        StringBuilder s3=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for (int i=0;i<(s.length()/2);i++){
            s1.append(s.charAt(i));
        }
        for (int i=s.length()/2;i<s.length();i++){
            s2.append(s.charAt(i));
        }
        s1.reverse();
        s3=s1;
        s2.reverse();
        for (int i=0;i<s2.length();i++){
            s1.append(s2.charAt(i));
        }
        System.out.println(s1);

        if(s3.equals(s2)){
            System.out.println("YES THEY ARE EQUAL {equal function}");
        }
        else {
            System.out.println("NO NOT EQUAL {equal function}");
        }
        boolean check2=true;
        for (int i=0;i<s2.length();i++){
            if(s3.charAt(i)!=s2.charAt(i)){
                check2=!check2;
            }
        }
        if (check2){
            System.out.println("YES EQUAL {char - char comparision}");
        }
        else {
            System.out.println("NO NOT EQUAL {char - char comparision}");
        }
    }

}
