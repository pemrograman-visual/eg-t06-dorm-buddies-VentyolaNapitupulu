// 12S24039 - Jody Alfonso Siahaan
// 12S24042- Ventyola Rohati Napitupulu
import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] namE = new String[4];
        int i;

        i = 0;
        func_default(i, namE);
        inputbuddies(i, namE);
        outputbuddies(i, namE);
    }
    
    public static void func_default(int i, String[] name) {
        for (i = 0; i <= 3; i++) {
            name[i] = "";
        }
    }
    
    public static void inputbuddies(int i, String[] name) {
        for (i = 0; i <= 3; i++) {
            name[i] = input.nextLine();
            if (name[i].equals("---")) {
                name[i] = "";
                i = 3;
            }
        }
    }
    
    public static void outputbuddies(int i, String[] name) {
        for (i = 0; i <= 3; i++) {
            System.out.println(name[i]);
        }
    }
}
