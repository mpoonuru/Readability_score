import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if(a>0 && b>0)
        {
            System.out.println(b/a);
        }
    }
}