/* Input a string from the user. create a new string called 'result' in which you will replace the letter 'e' in 
the original string with letter 'i'. */
import java.util.*;

public class Replace_Letter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result += 'i';
            } 
            else {
              result += str.charAt(i);  
            }
        }

        System.out.println(result);
        sc.close();
    }
}
