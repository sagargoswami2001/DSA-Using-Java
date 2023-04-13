// Move all 'X' to the end of the String.
public class Move_All_X {
    public static void moveAllX(String str, int idx, int count, String newString) {
        if (idx == str.length())
        {
            for (int i=0; i<count; i++)
            {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x')
        {
            count++;
            moveAllX(str, idx+1, count, newString);
        }
        else
        {
            newString += currChar;  //newString = newString + currchar
            moveAllX(str, idx+1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "Sxaxgxaxr";
        moveAllX(str, 0, 0, "");
    }
}
// Time Complexity is O(n)