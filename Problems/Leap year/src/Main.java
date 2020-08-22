import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0 && n%100!=0)
        {
            System.out.println("Leap");
        }
        else if(n%400==0)
        {
            System.out.println("Leap");
        }
        else
        {
            System.out.println("Regular");
        }
    }
}