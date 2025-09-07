package Questions;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(
                    "\nPress\n1. For Area\n2. Area Of Triangle\r\n" + //
                                                "3. Area Of Rectangle Program \r\n" + //
                                                "4. Area Of Isosceles Triangle \r\n" + //
                                                "5. Area Of Parallelogram\r\n" + //
                                                "6. Area Of Rhombus\r\n" + //
                                                "7. Area Of Equilateral Triangle\r\n" + //
                                                "8. Perimeter Of Circle\r\n" + //
                                                "9. Perimeter Of Equilateral Triangle\r\n" + //
                                                "10. Perimeter Of Parallelogram\r\n" + //
                                                "11. Perimeter Of Rectangle\r\n" + //
                                                "12. Perimeter Of Square\r\n" + //
                                                "13. Perimeter Of Rhombus\r\n" + //
                                                "14. Volume Of Cone Java Program\r\n" + //
                                                "15. Volume Of Prism\r\n" + //
                                                "16. Volume Of Cylinder\r\n" + //
                                                "17. Volume Of Sphere\r\n" + //
                                                "18. Volume Of Pyramid\r\n" + //
                                                "19. Curved Surface Area Of Cylinder\r\n" + //
                                                "20. Total Surface Area Of Cube\r\n"+//
                                                "*****************************************************\r\n"
            );
            int in = sc.nextInt();
            if(in==1){
                System.out.print("Enter the Radius : ");
                float r = sc.nextFloat();
                System.out.println("Area is : "+ 3.14*r*r);
            } else if (in==2) {
                System.out.print("Enter the base : ");
                float b = sc.nextFloat();
                System.out.print("Enter the base : ");
                float h = sc.nextFloat();
                System.out.println("The area of Triangle is : "+(0.5*b*h));
            }
        }
    }
}
