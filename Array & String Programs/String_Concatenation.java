public class String_Concatenation {
    public static void main(String[] args) {
        
        // Concatenation
        String firstname = "Sagar";
        String lastname = "Goswami";
        String fullname = firstname + " " + lastname;

        System.out.println(fullname);
        System.out.println(fullname.length());  // Print Length

        // Print Single Character of own string
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}
