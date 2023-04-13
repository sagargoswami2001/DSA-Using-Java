public class Marks {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // int marks[] = new int[3];

        // 1st Method
        int marks[] = {27, 06, 2001};

        // 2nd Method
        // marks[0] = 27;
        // marks[1] = 06;
        // marks[2] = 2001;

        // First Method for Print Array
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println();

        // Second Method for Print Array
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}
