import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Your second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Your third Number: ");
        int num3 = sc.nextInt();

        System.out.print("Your multiplication of 3 numbers is: " + (num1-num2-num3));
    }
}