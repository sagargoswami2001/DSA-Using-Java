// Print all the Subsequences of a String.
public class Subsequences_String {
    public static void subsequences(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // To be
        subsequences(str, idx+1, newString+currChar);

        // Or not to be
        subsequences(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
// Time Complexity is O(2^n)
