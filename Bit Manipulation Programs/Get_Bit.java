public class Get_Bit {
    public static void main(String args[]) {
        
        int n = 5;  //0101
        int pos = 3;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0)
        {
            System.out.println("Bit Was Zero");
        }
        else {
            System.out.println("Bit Was One");
        }
    }
}
