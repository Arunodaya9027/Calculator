import java.util.*;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Dividend Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Your divisor Number: ");
        int num2 = sc.nextInt();

        System.out.print("Your division of numbers is: " + ((double)(num1) / (double)(num2)));
    }
}