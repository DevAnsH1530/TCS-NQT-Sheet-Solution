import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check_Palindrome {
    public static void main(String[] args) {
        System.out.println(args.length);
        List<String> ls = new ArrayList<>();
        System.out.println(ls.size());
        ls = Arrays.asList(args);
        ls.forEach(e -> System.out.println(e));
        System.out.println();
        int num = Integer.parseInt(args[0]);
        System.out.println(checkPalindrome(num));
    }

    public static String checkPalindrome(int num){

        int temp = num;
        int revNum = 0;
        while(temp>0){
            int remainder = temp % 10;
            revNum = revNum * 10 + remainder;
            temp /= 10;
        }

        return num==revNum?"Yes":"No";
    }
}