// Print a String in Reverse.
public class Reverse_String {
    public static void printRev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }

    public static void main(String[] args) {
        String str = "sagar";
        printRev(str, str.length()-1);
    }
}

// 2nd Method.
// public class Reverse_String {
//     public static String revString(String str) {
//         if (str.length() == 1) {
//             return str;
//         }

//         char currChar = str.charAt(0);
//         String nextString = revString(str.substring(1));
//         return nextString + currChar;
//     }

//     public static void main(String[] args) {
//         String str = "sagar";
//         String reversed = revString(str);
//         System.out.println(reversed);
//     }
// }
