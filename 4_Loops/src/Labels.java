public class Labels {
    public static void main(String[] args) {

//        using labels with continue and break keyword

        int count=0;
        myloop: for(int i = 1;count<5;i++) {
            int check = 5 * i;
            if (check % 5 == 0 && check % 7 == 0) {
                System.out.println(check);
                count++;
            } else {
                continue myloop;
            }
        }

    }
}
