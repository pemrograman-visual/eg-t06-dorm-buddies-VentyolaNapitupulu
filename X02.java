//// 12S24039 - Jody Alfonso Siahaan
//// 12S24042 - Ventyola Rohati Napitupulu
import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nama = new String[4];

        func_default(nama);
        inputbuddies(nama);
    }
    
    public static void func_default(String[] nama) {
        int i;

        for (i = 0; i <= 3; i++) {
            nama[i] = "";
        }
    }
    
    public static void inputbuddies(String[] nama) {
        int x, z;

        for (x = 0; x <= 3; x++) {
            nama[x] = input.nextLine();
            if (nama[x].equals("---")) {
                nama[x] = "";
                z = x;
                x = 4;
            } else {
                z = x;
            }
        }
        outputbuddies(nama);
    }
    
    public static void outputbuddies(String[] nama) {
        int c;

        for (c = 0; c <= 3; c++) {
            System.out.println(nama[c]);
        }
    }
}


