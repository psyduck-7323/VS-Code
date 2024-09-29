import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //Even Numbers
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Range of Numbers :");
        int a = Input.nextInt();
        int b = Input.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("are Even Numbers In the Range " + a + " and " + b);
        */

        //Sum and Average
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Range of Inputs :");
        int r = Input.nextInt();
        int Sum = 0;
        System.out.print("Enter Value of " + r + " Numbers :");
        for (int i = 0; i < r; i++) {
            Scanner arc = new Scanner(System.in);
            int num = arc.nextInt();
            Sum = Sum + num;
            arc.close();
        }
        double Average = Sum/r;
        System.out.println("The Sum is :" + Sum + " and the Average is :" + Average);
        */

        //Sum of Digits
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Number :");
        int Number = Input.nextInt();
        int sum = 0;
        while ( Number != 0) {
            int a = Number%10;
            sum = sum + a;
            Number = Number/10;
        }
        System.out.println("Sum is :" + sum);
        */
        
        //Factorial of a given Number
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = Input.nextInt();
        int Factorial = 1;
        for (int i = 1; i <= n; i++) {
            Factorial = Factorial * i;
        }
        System.out.println("Factorial of Given Number is :" + Factorial);
        */
        
        //HCF And LCM
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Two Numbers :");
        int num1 = Input.nextInt();
        int num2 = Input.nextInt();
        int n = 0;
        if (num1 > num2) {
            n = num1;
        } else {
            n = num2;
        }
        int HCF = 0;
        for (int i = 1; i <= n; i++) {
            int div1 = num1%i;
            int div2 = num2%i;
            if (div1 == 0 && div2 == 0 ) {
                HCF = i;
            }
        }
        int LCM = (num1 * num2) / HCF;
        System.out.println("HCF of Given Number is :" + HCF);
        System.out.println("LCM of Given Number is :" + LCM);
        */

        //ODD and EVEN
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Range of Numbers :");
        int a = Input.nextInt();
        int b = Input.nextInt();
        System.out.print("All Even Numbers in the Range are :");
        for (int i = 1; i <= b; i++) {
            if (i%2 == 0) {
                System.out.print(i);
                System.out.print(" ");
            } else {
                continue;
            }
        }
        System.out.print("\nAll Odd Numbers in the Range are :");
        for (int i = 1; i <= b; i++) {
            if (i%2 != 0) {
                System.out.print(i);
                System.out.print(" ");
            } else {
                continue;
            }
        }
        */

        // x to the Power of y
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Value of 'x' and 'y'(x to the Power of y) :");
        int x = Input.nextInt();
        int y = Input.nextInt();
        int power = x;
        for (int i = 2; i <= y; i++) {
            power = power * x;
        }
        System.out.println(x + " to the Power of " + y +" :" + power);
        */
        
        //Fibonacci sequence
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Value of N :");
        int N = Input.nextInt();
        int Fibonacci;
        int a = 0;
        int b = 1;
        System.out.print("First " + N + " numbers of the Fibonacci sequence are :" + 0 + " ");
        for (int i = 0; i <= N; i++) {
            Fibonacci = a + b;
            a = b;
            b = Fibonacci;
            System.out.print(Fibonacci);
            System.out.print(" ");
            
        }
        */

        //Reverse of a Number
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Value of Number :");
        int Num = Input.nextInt();
        int Original = Num;
        int Reverse = 0 , Remainder;
        while (Num != 0) {
            Remainder = Num % 10;
            Reverse = Reverse * 10 + Remainder;
            Num = Num / 10;
        }
        System.out.println("Reverse of " + Original + " is :" + Reverse);
        */
        
        //Number is Palindrome
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Value of Number :");
        int Num = Input.nextInt();
        int Original = Num;
        int Reverse = 0 , Remainder;
        while (Num != 0) {
            Remainder = Num % 10;
            Reverse = Reverse * 10 + Remainder;
            Num = Num / 10;
        }
        if (Original == Reverse) {
            System.out.println("Number is Palindrome.");
        } else {
            System.out.println("Number is Not Palindrome."); 
        }
        */
        
        //Find out (x^n)/n!
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Value of 'x' and 'n'[(x^n)/n!] :");
        int x = Input.nextInt();
        int n = Input.nextInt();
        double power = x;
        for (int i = 2; i <= n; i++) {
            power = power * x;
        }
        double Factorial = 1;
        for (int i = 1; i <= n; i++) {
            Factorial = Factorial * i;
        }
        double Answer = power/Factorial;
        System.out.println(x + " to the power " + n + " divided by " + n + "! :" + Answer);
        */

        //Prime Number
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Value of Number :");
        int Num = Input.nextInt();
        int y = 0;
        for (int i = 2; i <= (Num - 1); i++) {
            y = Num % i;
            if (y == 0) {
                break;
            }
        }
        if (y == 0) {
            System.out.println("Number is Not Prime.");
        } else if (Num == 2) {
            System.out.println("Number is Prime.");
        } else {
            System.out.println("Number is Prime.");
        }
        */

        //System.out.print series
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int Num = Input.nextInt();
        int s = 0;
        System.out.print("Series :");
        while (s <= Num) {
            System.out.print(s);
            System.out.print(" ");
            s =  (s * 2) + 1;
        }
        */

        //Series Sum of  S = 1 + (1+2) +(1+2+3) + ... + (1+2+3+...+n)
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Value of N :");
        int N = Input.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = sum + (i * (i + 1)) / 2;
        }
        System.out.println("The Sum of Series till " + N + " is :" + sum);
        */
        
        //Perfect Square
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = Input.nextInt();
        int q = 0;
        int ar = 0;
        for (int i = 1; i * i <= num; i++) {
            q = num/i;
            ar = num%i;
            if (q == i && ar == 0) {
                System.out.println(num + " is a Perefct Square");
                break;
            } else if (q == 1) {
                System.out.println(num + " is Not a Perfect Square");
                break;
            } else {
                continue;
            }
        }
        */

        //Multiplication Table
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = Input.nextInt();
        for (int i = 1; i <= 10; i++) {
            int multiply = num * i;
            System.out.println(num + " X " + i + " = " + multiply);
        }
        */

        //Prime Numbers in a Given Range
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Range :");
        int a = Input.nextInt();
        int b = Input.nextInt();
        int y = 0;
        System.out.print("The Prime Numbers in the Range " + a + " to " + b + " are : ");
        for (int i = a ; i <= b; i++) {
            int prime = 1;
            for (int j = 2; j * j <= i ; j++) {
                y = i % j;
                if (y == 0) {
                    prime = 0;
                    break;
                } 
            }
            if ( prime == 1 && i > 1) {
                System.out.print(i);
                System.out.print(" ");
            } 
        }
        */

        //Sum of Square of First N numbers
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = Input.nextInt();
        int Sum = 0;
        for (int i = 1; i <= num; i++) {
            Sum = Sum + ( i * i );
        }
        System.out.println("Sum of Square of First " + num + " Numbers is :" + Sum );
        */

        //Armstrong Number
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int Num = Input.nextInt();
        int Remainder =0;
        double sum = 0;
        int S = 0;
        int original = Num;
        while (Num != 0) {
            Num = Num / 10;
            S++;
        }
        Num = original;
        while (Num != 0) {
                Remainder = Num % 10;
                sum = sum + Math.pow(Remainder,S);
                Num = Num / 10;
        }
        if (original == sum) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is Not an Armstrong Number.");
        }
        */

        //Perfect Number
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = Input.nextInt();
        int original = num;
        int y = 0;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            y = num % i;
            if (y == 0) {
                sum  = sum + i;
            } else {
                continue;
            }
        }
        if (original == sum) {
            System.out.println(original + " is a Perfect Number.");
        } else {
            System.out.println(original + " is Not a Perfect Number.");
        }
        
        Input.close();
    }
}
