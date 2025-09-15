import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("Enter the power : ");
        int power = sc.nextInt();
        int ans=1;
        for(int i=1;i<=power;i++){
            ans*=number;
        }
        System.out.println("Ans is : "+ans);
    }
}
