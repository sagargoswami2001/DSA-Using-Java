// Java Program to check if a number is power of two or not.
public class Power_2_or_not {
    public static void main(String[] args) {
        
        int num = 4;
        boolean flag = true;

        while (num!=2) {
            if (num%2!=0) {
                flag = false;
                break;
            }
            num = num/2;
        }

        if (flag==true) {
            System.out.println("Your Number is a Power of 2");
        } else {
           System.out.println("Your Number is not a Power of 2"); 
        }
    }
}
