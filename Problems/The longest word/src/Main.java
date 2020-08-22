import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();
        String str[]=a.split(" ");
        int max=0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i].length()>max)
            {
                max=str[i].length();
            }
        }
        for(int i=0;i<str.length;i++)
        {
            if(str[i].length()==max)
            {
                System.out.println(str[i]);
                i=str.length;
                break;
            }
        }
    }
}