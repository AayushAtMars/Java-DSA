import java.util.Scanner;

public class OddPlusEvenMinus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int in = sc.nextInt();
        int ans=0;
        for(int i = 1; i<= in; i++){
            if(i%2==0){
                ans-=i;
            } else{
                ans +=i;
            }
        }
        System.out.println(ans);
    }
}
