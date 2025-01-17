import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Your second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Your third Number: ");
        int num3 = sc.nextInt();
        
        int res = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.print("Your smallest of all three numbers is: " + res);
    }
}
