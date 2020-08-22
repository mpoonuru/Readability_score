import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();
        int flag=0;
        String arr[]=a.split("\\?");

        String arr1[]=arr[1].split("&");
        String b="";
        String c="";
        //String arr2[];

        for(int i=0;i<arr1.length;i++)
        {
            String arr2[]=arr1[i].split("=");
            System.out.print(arr2[0]+" : ");
            if(arr2[0].equals("pass"))
            {
                flag=1;
                b="password : "+arr2[1];
            }
            if(arr2.length>1)
            {
                System.out.println(arr2[1]);
            }
            else
            {
                System.out.println("not found");
            }
        }
        if(flag==1)
        {
            System.out.println(b+c);
        }
    }
}
