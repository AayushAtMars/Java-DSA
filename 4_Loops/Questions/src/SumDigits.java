import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to sum digits : ");
        int in=sc.nextInt();
        int temp = in;
        int count = 0;
        int sum = 0;
        for(int i=1;in>0;i++){
                temp=temp%(10*i);
                sum=sum+temp;
                in/=10;
                count++;
        }
        System.out.println("Sum is : "+sum);
        System.out.println("Count is : "+count);
    }
}
