import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        Double a=sc.nextDouble();
        Double b=sc.nextDouble();
        Double c=sc.nextDouble();
        double p=(a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(s);
    }
}