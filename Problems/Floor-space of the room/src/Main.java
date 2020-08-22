import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        String choice=sc.nextLine();
        switch (choice)
        {
            case "triangle":
                double a=sc.nextDouble();
                double b=sc.nextDouble();
                double c=sc.nextDouble();
                double s=(a+b+c)/2d;
                double area=Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
                System.out.println(area);
                break;
            case "rectangle":
                double l=sc.nextDouble();
                double br=sc.nextDouble();
                System.out.println(l*br);
                break;
            case "circle":
                double r=sc.nextDouble();
                System.out.println(3.14*r*r);
                break;
        }
    }
}