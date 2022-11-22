import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Fibonacci Series");
        System.out.println("2. Perfect Number");
        System.out.println("3. Prime Number");
        System.out.println("4. Reverse a number");
        System.out.println("5. Coupon Numbers\n");
        System.out.println("Enter Problem Number : ");
        Scanner sc = new Scanner(System.in);
        int probNumber = sc.nextInt();
        Main obj = new Main();
        switch (probNumber) {
            case 1:
                obj.getFibonacci(10);
                break;
            case 2:
                obj.getPerfectNumber(28);
                break;
            case 3:
                obj.isPrime();
                break;
            case 4:
                obj.getReverse(1234);
                break;
            case 5:
                obj.getCoupon();
                break;
            default:
                System.out.println("invalid choice");
        }
    }

    private void getCoupon() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Coupon do you need:- ");
        int number = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        int count = 0;
        for (int i = 0; i < number; i++) {
            String coupon = String.valueOf((int) (Math.random() * 10000000));
            if (list.contains(coupon)) continue;
            list.add(coupon);
            count++;
        }
        System.out.println("coupon count=" + count);
        System.out.println(list);
    }

    private void isPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to Check Prime or Not:- ");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        if (count == 2) {
            System.out.print(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
    }

    private void getReverse(int number) {
        int reverse = 0;
        for (int i = number; i != 0; i = i / 10) {
            int remainder = i % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("input number:- " + number);
        System.out.println("reverse number is:- " + reverse);
    }

    private void getPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (number == sum) System.out.println(number + " is Perfect Number");
    }

    private void getFibonacci(int number) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < number; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
