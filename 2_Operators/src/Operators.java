public class Operators {
    public static void main(String[] args) {

// Arithmetic Operators(+, -, *, /, %(modulus), ++, --), Relational Operators(==, !=, >, <, >=, <=), logical Operators(&&, ||, !), Assignment Operators(=, +=, -=, /=, %=), Unary Operators(+, -, ++, --, !), Bitwise Operators(|(Bitwise OR), &(Bitwise AND), ^(Bitwise Exclusive OR or XOR), ~(Bitwise NOT) <<(Left Shift), >>(Right Shift))


// Arithmetic Operators
System.out.println("Arithmetic Operators");
        float a = 7;
        float b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a++);
        System.out.println(b--);

//Relational Operators
System.out.println("Relational Operators");
        int x = 2;
        int y = 3;
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x>=y);
        System.out.println(x<=y);

// Logical Operators
System.out.println("Logical Operators");
        boolean p = true;
        boolean q = false;
        System.out.println(p&&q);
        System.out.println(p||q);
        System.out.println(p!=q);

// Assignment operators
System.out.println("Assignment Operators");
        int w = 10;
        int t;
        t=w;
        System.out.println(t);
        t+=w;
        System.out.println(t);
        t-=w;
        System.out.println(t);

//Precedence and Associativity
System.out.println("Precedence and Associativity");
 /*
------------------------------------------------------------
|   Category       |   Operators                  | Associativity   |
------------------------------------------------------------
| Postfix/Infix    | ++  --                       | Left to right   |
| Unary            | ++  --  +  -  !  ~           | Right to left   |
| Multiplicative   | *  /  %                      | Left to right   |
| Additive         | +  -                         | Left to right   |
| Shift            | <<  >>  >>>                  | Left to right   |
| Relational       | <  <=  >  >=                 | Left to right   |
| Equality         | ==  !=                       | Left to right   |
| Bitwise AND      | &                            | Left to right   |
| Bitwise XOR      | ^                            | Left to right   |
| Bitwise OR       | |                            | Left to right   |
| Logical AND      | &&                           | Left to right   |
| Logical OR       | ||                           | Left to right   |
| Conditional      | ?:                           | Right to left   |
| Assignment       | =  +=  -=  *=  /=  %=        | Right to left   |
|                  | >>=  <<=  &=  ^=  |=         |                 |
------------------------------------------------------------
*/
        int m = 10;
        int n = 20;
        int r = 30;
        int s = 40;
        // int s = p-++r-++q;
        int result = m + n * r / s - m + n;
        System.out.println(result);

// Bitwise Operator : It converts decimal numbers to binary and appy OR operator on corresponding bits and return 0 or 1;
System.out.println("Bitwise Operators");
        int A = 5;  // (0101) in binary
        int B = 3;  // (0011) in binary

        // Bitwise AND
        System.out.println("A & B: " + (A & B)); // (0001) in binary which is 1 in decimal
        // 0 1 0 1
        // 0 0 1 1
        // - - - - 
        // 0 0 0 1
        // - - - - 

        // Bitwise OR
        System.out.println("A | B: " + (A | B)); // (0111) in binary which is 7 in decimal
        // 0 1 0 1
        // 0 0 1 1
        // - - - - 
        // 0 1 1 1
        // - - - - 

        // Bitwise XOR - same input -> 0
        //             - diff input -> 1
        System.out.println("A ^ B: " + (A ^ B)); // (0110) in binary which is 6 in decimal
        // 0 1 0 1
        // 0 0 1 1
        // - - - - 
        // 0 1 1 0
        // - - - - 

        // Bitwise NOT
        System.out.println("~A: " + (~A)); // Inverts all bits of A

        // Left Shift
        System.out.println("A << 1: " + (A << 1)); // Shifts bits of A to the left by 1 position
        // 0 1 0 1 0
        // _ _ _ _ _

        // Right Shift
        System.out.println("A >> 1: " + (A >> 1)); // Shifts bits of A to the right by 1 position
        // 0 1 0
        // _ _ _

    }
}
