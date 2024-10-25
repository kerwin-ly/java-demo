import java.text.NumberFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Number
        double t = (double)10 / (double)3;
        System.out.println(t);
        int a = 1;
        int b = a++; // will copy a to b first, and then a+1
        int c = ++a; // will run a+1, then copy a to c
        a+=2; // a = a + 2;
        System.out.println(c);

        // String
        String str = "test ";
        System.out.println(str.startsWith("t"));
        System.out.println(str.trim());
        System.out.println(str.indexOf("w"));

        // Array
        int[] list = { 1, 2, 5, 4 };
        int[][] nums = new int[2][3]; // two rows and three columns
        int[][] nums2 = {{ 1, 2 }, { 2, 3 }};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.deepToString(nums));

        // Constant
        final int MAX_LEN = 5; // define a constant

        // Implicit Casting: byte → short → int → long → float → double
        double x = 1.1;
        int y = 2;
        System.out.println(x + y);
        String t3 = "1";
        int t4 = Integer.parseInt(t3) + y;
        double t5 = Double.parseDouble(t3) + y;
        System.out.println(t5); // cast a string to int

        // Math
        int t6 = (int)Math.ceil(3.3f);
        int t7 = (int)Math.floor(3.5F);
        int t8 = Math.max(t6, t7);
        double t9 = Math.random();
        System.out.println(t7);

        // Format
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234333.333);
        System.out.println(result);
        String percent = NumberFormat.getPercentInstance().format(0.2); // use method chaining to format
        System.out.println(percent);

        // Comparison statement, logical operators
        int t10 = 1;
        String t11 = "23";
        System.out.println(t10 > Integer.parseInt(t11) && t10 > 1);

        // Condition statement / If statement
        if (t10 == 1) {
            System.out.println("That's true");
        } else {
            System.out.println("Not true");
        }

        // Ternary operator
        char t12 = t10 > 1 ? 'R' : 'L';

        // Switch statement
        switch (t10) {
            case 1:
                System.out.println('1');
                break;
            default:
                System.out.println('2');
                break;
        }

        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // While Loop
        while (t10 != 10) {
            t10++;
        }
        System.out.println(t10);

        // ForEach Loop
        String[] fruits = {"Apple", "Orange"};
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}