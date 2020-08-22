import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int n = 0;
        char arr[] = a.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'c' || arr[i] == 'g') {
                n++;
            }
        }
            int k = arr.length;
        double result=(double)n/k;
        System.out.println(result*100);
        }
}