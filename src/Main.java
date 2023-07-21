import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static int isPalindrome(String s,int start,int end)
    {
        if(start>end)
        {
            return 1;
        }
        if(s.charAt(start)!=s.charAt(end))
        {
            return 0;
        }
        else{
            return isPalindrome(s,start+1,end-1);
        }
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(in);
        out.println("Enter the String: ");
        String value=scanner.nextLine();
        out.println(isPalindrome(value,0,value.length()-1));
    }
}