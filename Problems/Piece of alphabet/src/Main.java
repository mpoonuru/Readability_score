import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b="abcdefghijklmnopqrstuvwxyz";
        if(b.contains(a))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}