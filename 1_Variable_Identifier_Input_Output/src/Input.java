//Java Scanner Class
//It is present in java.util package(collection of classes, interfaces, subclasses)

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();   //to take integer input
        sc.nextLine(); //consume the leftover newline

        System.out.print("Enter your name : ");
//        String name =sc.next();   //to take string input (single word withour space)
        String name =sc.nextLine();   //to take string input (line with space)

        System.out.println("Your Number is "+n);
        System.out.print("Your name is "+name);
        sc.close();
    }
}


//Java Scanner Methods to take input
//nextInt(),  nextFloat(), nextBoolean(), nextLine(), next(), nextByte(), nextDouble(), nextShort(), nextlong()