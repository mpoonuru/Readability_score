import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n=scanner.nextInt();
        boolean b=scanner.nextBoolean();
        boolean result;
        if(n>=10 && n<=20 && !b)
        {
            result=true;
        }
        else if(n>=15 && n<=25 && b)
        {
            result=true;
        }
        else
        {
            result=false;
        }
        System.out.println(result);
    }
}