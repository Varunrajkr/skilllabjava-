import java.util.Scanner;
public class swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Number:");
        int a=sc.nextInt();
        System.out.print("Enter your Second Number:");
        int b=sc.nextInt();
        System.out.println("Before swapping A and B:"+a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping A and B:"+a+" "+b);

}
}
