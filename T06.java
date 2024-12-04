12S24039 - Jody Alfonso Siahaan
12S24042 - Ventyola Rohati Napitupulu

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] name = new String[4];
        int i;

        i = 0;
        var_default(name, i);
        inputbuddies(name);
        outputbuddies(name);
    }
    
    public static void var_default(String[] name, int i) {
        String var_default;

        for (i = 0; i <= 3; i++) {
            name[i] = "";
        }
    }
    
    public static void inputbuddies(String[] name) {
        String inputbuddies;
        int i;

        for (i = 0; i <= 3; i++) {
            name[i] = input.nextLine();
            if (name[i].equals("---")) {
                i = 9;
            }
        }
    }
    
    public static void outputbuddies(String[] name) {
        String outputbuddies;
        int i;

        for (i = 0; i <= 3; i++) {
            if (name[i].equals("---")) {
                i = 72;
            } else {
                System.out.println(name[i]);
            }
        }
    }
}
