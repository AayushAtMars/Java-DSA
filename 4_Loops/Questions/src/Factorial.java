import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int n = sc.nextInt();
        int fact=1;
        for(int i = n; i>0;i--){
            if(n==0){
                System.out.println("Factorial is : "+fact);
            }else{
                fact = fact*i;
            }
        }
        System.out.print("Factorial is : "+fact);
    }
}
