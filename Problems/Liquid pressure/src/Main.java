import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double p=scanner.nextDouble();
        double h=scanner.nextDouble();
        double result=p*h*9.8;
        System.out.println(result);
    }
}