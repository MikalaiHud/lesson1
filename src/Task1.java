public class Task1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 12000;
        int i = 1200;
        long l = 4996;
        float f = 3.5F;
        double d = 7.9;
        char c = 'f';
        String string1 = "Some STRING_NUMBER";

        System.out.println("short s = " + s + " {-32768 - 32767}");
        System.out.println("int i =" + i + " {-2147483648 - -2147483647}");
        System.out.println("long l =" + l + " {-9223372036854775808 - -9223372036854775808}");
        System.out.println("float f = " + f + " {-1.4 e-045 - 3.4 e+038}");
        System.out.println("double d = " + " {4.9е-324 - 1.8е+308}");
        System.out.println("byte b = " + b + " {-128 - 127}");
    }
}
