import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to count digits : ");
        int in=sc.nextInt();
        int count = 0;
        for(int i=0;in>0;i++){
                in/=10;
                count++;
        }
        System.out.println("Count is : "+count);
    }
}