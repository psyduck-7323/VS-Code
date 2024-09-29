import java.util.Scanner;

public class Functions {

    // Addition of two Numbers
    /*
    public static int Sum (int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        System.out.print("Enter Numbers :");
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int b = Input.nextInt();
        int Result = Sum(a, b);
        System.out.println("The Sum is :" + Result);
        Input.close();
    }
    */
    
    //Factorial of a Number
    /*
    public static int Factorial (int Num) {
        int Fac = 1;
        if (Num < 0){
            System.out.print("Invalid Input")
            return;
        }
        for (int i = Num; i >= 1; i--) {
            Fac *= i;
        }
        return Fac;
    }
    public static void main(String[] args) {
        System.out.print("Enter Numbers :");
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int Result = Factorial(a);
        System.out.println("The Factorial is :" + Result);
        Input.close();
    }
    */
    
    //Prime Number
    /*
    public static int IsPrime (int Num){
        if (Num < 0) {
            System.out.println("Invalid Input");
        } else {
            int Counter = 0;
            for (int i = 2; i <= Num - 1; i++) {
                if (Num % i == 0) {
                    Counter = 1;
                }
            }
            if (Counter == 0) {
                System.out.println("Given Number is Prime.");
            } else {
                System.out.println("Given Number is Not Prime.");
            }
        }
        return 0;

    } 
    public static void main(String[] args) {
        System.out.print("Enter Numbers :");
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        IsPrime(a);
        Input.close();
    }
    */

    //Swapping Function
    /*
    public static int Swapping(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping Numbers Are -");
        System.out.println("First Number :" + x);
        System.out.println("Second Number :" + y);
        return 0;
    }
    public static void main(String[] args) {
        System.out.print("Before Swapping Numbers are :");
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int b = Input.nextInt();
        Swapping(a, b);
        
        Input.close();
    }
    */

    //Sum of Digit of  a Number
    /*
    public static int SumOfDigit(int x) {
        int Remainder, Sum = 0;
        while (x > 0) {
            Remainder = x % 10;
            Sum += Remainder;
            x /= 10;
        }
        return Sum; 
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number :");
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int Result = SumOfDigit(a);
        System.out.println("The Sum of Digits is :" + Result);
        Input.close();
    }
    */

    //Palindrome Number
    /*
    public static int Palindrome(int x) {
        int Remainder, Result = 0;
        while (x > 0) {
            Remainder = x % 10;
            Result = Result * 10 + Remainder;
            x /= 10;
        }
        return Result; 
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number :");
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int Original = a;
        int Reversed = Palindrome(a);
        if (Original == Reversed) {
            System.out.println("Given Number is a Palindrome.");
        } else {
            System.out.println("Given Number is Not a Palindrome.");
        }
        
        Input.close();
    }
    */

    //Number of Zeroes in Positive Number
    /*
    public static int Zeroes(int x) {
        int Remainder, Counter = 0;
        while (x/10 > 0) {
            Remainder = x % 10;
            if (Remainder == 0) {
                Counter++;
            }
            x /= 10;
        }
        return Counter; 
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number :");
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int Result = Zeroes(a);
        System.out.println("The Number of Zeroes in Number are :" + Result);
        Input.close();
    }
    */

    //GCD/HCF
    /*
    public static int HCF(int x, int y) {
        int R1 = 0, R2 = 0, Divisor = 0;
        int large = 0;
        if (x > y) {
            large = x;
        } else {
            large = y;
        }
        for (int i = 1; i <= large; i++) {
            R1 = x % i;
            R2 = y % i;
            if (R1 == 0 && R2 == 0) {
                Divisor = i;
            }        
        }
        return Divisor; 
    }
    public static void main(String[] args) {
        System.out.print("Enter Numbers :");
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int b = Input.nextInt();
        int Result = HCF(a, b);
        System.out.println("The HCF of  Given Numbers is :" + Result);
        Input.close();
    }
    */

    //Combinatorics
    /*
    public static int Factorial(int x) {
        int fac = 1;
        for (int i = x; i >= 1; i--) {
            fac *= i;
        }
        return fac;
    }
    public static int Combinatorics(int N, int R) {
        int comb = Factorial(N) / (Factorial(N - R) * Factorial(R));
        return comb;
    }
    public static void main(String[] args) {
        System.out.print("Enter Value of N and R (nCr) :");
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        int r = Input.nextInt();
        int Result = Combinatorics(n, r);
        System.out.println("The Value of nCr is :" + Result);
        Input.close();
    }
    */

    //Fibonacci Sequence
    /*
    public static int Fibonacci( int x) {
        int fib = 0, a = 1, b = 1;
        if (x == 1) {
            fib = 0;
        } else if (x == 2 || x == 3) {
            fib = 1;
        } else {
            for (int i = 4; i <= x; i++) {
            fib = a + b;
            a = b;
            b = fib;
            }
        }
        return fib;
    }
    public static void main(String[] args) {
        System.out.print("Enter the Value of nth Term :");
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int Result = Fibonacci(a);
        System.out.println("The Value of "+ a +"th Term in Fibonacci Sequence is :" + Result);
        Input.close();
    }
    */

    //Number in Fibonacci Sequence or not
    /*
    public static void Fibonacci( int x) {
        int fib = 0, a = 1, b = 1;
        if (x == 0 || x == 1) {
            System.out.println("Entered Number " + x + " is in Fibonacci Series.");
        } else if (x > 1) {
            for (int i = 4; i <= x + 10; i++) {
            fib = a + b;
            a = b;
            b = fib;
            if (fib == x) {
                System.out.println("Entered Number " + x + " is in Fibonacci Series.");
                break;
            } else {
                continue;
            }
            }
            if (fib != x) {
                System.out.println("Entered Number " + x + " is Not in Fibonacci Series.");
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number :");
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        Fibonacci(a);
        Input.close();
    }
    */

    //Sum of Digit Untill Single Digit (Important)
    public static int SumOfDigit(int x) {
        int Sum = 0;
        while (x > 0 || Sum > 9) { //Imporatnt Logic
            if (x == 0) {
                x = Sum;    
                Sum = 0;    
            }  
            Sum += (x % 10);
            x /= 10;
        }
        return Sum; 
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number :");
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int Result = SumOfDigit(a);
        System.out.println("The Sum of Digits is :" + Result);
        Input.close();
    }
}
