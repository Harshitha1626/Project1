public class PalindromeGenerator {
    public static void main(String[] args) {
        int num = 123;
        while (num != Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString())) num++;
        System.out.println(num);
    }
}

