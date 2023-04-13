public class String_Compare {
    public static void main(String[] args) {
        
        // Compare String
        String name1 = "Sagar";
        String name2 = "Goswami";

        // compareTo function check strings in 3 ways.
        // 1. s1 > s2 : Positive Value
        // 2. s1 == s2 : 0
        // 3. s1 < s2 : Negative Value
        
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }

        // 2nd Method 
        if (name1 == name2) {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }

        // Check 2nd Method is correct every condition or not.
        // Gives Incorrect Answer Here.
        if (new String("Sagar") == new String("Sagar")) {
            System.out.println("Strings are equal");
        } else {                                            // This method is print wrong output.
            System.out.println("Strings are not equal");
        }
    }
}
