public class String_Builder {
    public static void main(String args[]) {
        StringBuilder sg = new StringBuilder("Sagar Goswami");
        StringBuilder mg = new StringBuilder("M");
        System.out.println(sg);

        // Char at Index 0
        System.out.println(sg.charAt(0));

        // Set char at Index 0
        // sg.setCharAt(0, 'G');
        // System.out.println(sg);

        // Insert at Index 0
        // sg.insert(0, 'S');
        sg.insert(3, 'a');
        System.out.println(sg);

        // Delete the extra 's'
        sg.delete(3, 4);
        System.out.println(sg);

        // Append String
        mg.append("ohit "); //if we do without append function: str = str + "ohit";
        mg.append("Goswami");
        System.out.println(mg);

        // Print String Length
        System.out.println(mg.length());
    }
}
