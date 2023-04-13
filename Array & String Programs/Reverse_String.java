public class Reverse_String {
    public static void main(String[] args) {
        StringBuilder sg = new StringBuilder("Sagar");

        for (int i = 0; i < sg.length()/2; i++) {
            int front = i;
            int back = sg.length() -1 -i;   // Logic: 5-1-0 = 4

            char frontChar = sg.charAt(front);
            char backChar = sg.charAt(back);

            sg.setCharAt(front, backChar);
            sg.setCharAt(back, frontChar);
        }

        System.out.println(sg);
    }
}
// In this Program time complexity is O(n)