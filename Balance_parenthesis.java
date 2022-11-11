import java.util.Scanner;
import java.util.Stack;

public class Balance_parenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character>stk=new Stack<>();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' ||s.charAt(i)=='[' ||s.charAt(i)=='(' ){
                stk.push(s.charAt(i));
            }
            if ((s.charAt(i)=='}'&& stk.peek()=='{' )||(s.charAt(i)==']'&& stk.peek()=='[') ||(s.charAt(i)==')'&& stk.peek()=='(' )){
                stk.pop();
            }
        }
        if(stk.empty()){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
