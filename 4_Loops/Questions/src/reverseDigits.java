import java.util.Scanner;

public class reverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int n = sc.nextInt();
        int rev = 0;
        for (int i = n; i>0; i/=10){
            int temp = i%10;
            rev=(rev*10)+temp;
        }
        System.out.print(rev);

    }
}
