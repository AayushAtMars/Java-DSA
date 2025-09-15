import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to sum digits : ");
        int in=sc.nextInt();
        int count = 0;
        int sum = 0;

        // while(in>0){
        //     int temp2 = in%10;
        //     sum+=temp2;
        //     in/=10;
        //     count++;
        // }

        for(int i=in;i>0;i/=10){
            int temp2 = i%10;
            sum+=temp2;
            count++;
        }
        System.out.println("Sum is : "+sum);
        System.out.println("Count is : "+count);
    }
}
