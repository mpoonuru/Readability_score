import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        String str = String.valueOf(a);
        if (str.length() > 1) {
            System.out.println(str.charAt(str.length() - 2));
        } else {
            System.out.println("0");
        }
    }
}