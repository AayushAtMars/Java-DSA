public class RectangularPattern {
    public static void main(String[] args) {

        // ******
        // ******
        // ******

        // int r = 3;
        // int c = 6;
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }




        // ******
        // *    *
        // *    *
        // ******

        // int r = 4;
        // int c = 6;
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=c;j++){
        //         if(i==1|| i==r|| j==1|| j==c){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }




        // *
        // **
        // ***
        // ****

        // int r = 4;
        // int c = 4;
        // for(int i =1;i<=r;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }




        // ****
        // ***
        // **
        // *

        int r = 4;
        int c = 4;
        for(int i = 0; i<r;i++){
            for(int j=0;j<c-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
