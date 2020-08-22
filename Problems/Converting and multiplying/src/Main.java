import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        ArrayList <String> arr=new ArrayList<String>();
        boolean x=true;
        while(x)
        {
            String a=sc.nextLine();
            if(a.equals("0"))
            {
                x=false;
            }
            else {
                arr.add(a);
            }
        }
        for(int i=0;i<arr.size();i++)
        {
            if(!arr.get(i).matches("\\d+"))
            {
                System.out.println("Invalid user input: "+arr.get(i));
            }
            else
            {
                int b=Integer.parseInt(arr.get(i));
                System.out.println(b*10);
            }
        }
    }
}