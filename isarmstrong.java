import java.util.*;
public class isarmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
       // System.out.println(count_of_digit(a));
     //   System.out.println(isarmstrong(a));
        int r1=sc.nextInt();
        int r2= sc.nextInt();
        for(int i =r1;i<=r2;i++){
            if (isarmstrong(i)==true)
                System.out.println(i);
        }
    }


    public static int count_of_digit(int a) {
        int c = 0;
        while (a > 0) {
            a /= 10;
            c++;
        }
        return c;
    }

    public static boolean isarmstrong(int a) {
        int pow = count_of_digit(a);
        int temp = a;
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum = (int) (sum + Math.pow(rem, pow));
            temp /= 10;
        }
        if (sum == a)
            return true;
        else
            return false;
    }
}
