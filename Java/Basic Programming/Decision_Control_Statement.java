import java.util.Scanner;

public class Decision_Control_Statement { 
    public static void main(String[] args) {
        
        //largest between three numbers
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your Numbers: ");
        int num1 = Input.nextInt();
        int num2 = Input.nextInt();
        int num3 = Input.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is Greatest among given numbers : " + num1 + ", " + num2 + " and " + num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is Greatest among given numbers : " + num1 + ", " + num2 + " and " + num3);   
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is Greatest among given numbers : " + num1 + ", " + num2 + " and " + num3); 
        } else {
            System.out.println("All Numbers are equal");
        }
        */

        //Odd or Even
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int number = Input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
        */

        //Whether it a vowel or consonant or not an alphabet
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your Character: ");
        char data = Input.next().charAt(0);
        char alpha = data;
        data = Character.toLowerCase(data); // Convert character to lowercase
        if ( data >= 'a' && data <= 'z') {
            if ( data == 'a' || data == 'e' || data == 'i' ||data == 'o' || data == 'u' ) {
                System.out.println(alpha + " is a Vowel.");
            } else {
                System.out.println(alpha + " is Consonant."); 
            }
        } else {
            System.out.println("Given Character is not a Alphabet :" + alpha);
        }
        */

        //calculate the electric bill
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Previous Meter Reading :");
        int Previous = Input.nextInt();
        System.out.print("Enter Current Meter Reading :");
        int Current = Input.nextInt();
        int Reading = Current - Previous;
        double amount = 0;
        if (Reading <= 100) {
            amount = Reading * 1.40;
            System.out.println("Amount to be Paid is :" + amount);
        } else if (Reading <100 && Reading >= 200) {
            amount = 100 * 1.40 + (Reading - 100) * 2.50;
            System.out.println("Amount to be Paid is :" + amount);
        } else {
            amount = (100 * 1.40) +  (100 * 2.50) + ((Reading - 200) * 3.20);
            System.out.println("Amount to be Paid is :" + amount);
        }
        */

        //Determine eligibility for admission
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the marks obtained in Physics, Chemistry and Mathematics:");
        int Physics = Input.nextInt();
        int Chemsitry = Input.nextInt();
        int Mathematics = Input.nextInt();
        int total = Physics + Chemsitry + Mathematics;
        int totpm = Physics + Mathematics;
        if (Physics >= 55 && Chemsitry >= 50 && Mathematics >= 65 && (total >= 190 || totpm >= 140)) {
            System.out.println("Candidate is Eligible for Admission."); 
        } else {
            System.out.println("Candidate is not Eligible for Admission."); 
        }
        */

        //Conversion to Uppercase
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter an Alphabet :");
        char data = Input.next().charAt(0);
        char Alpha = data;
        if (data >= 'a' && data <= 'z') {
            data = Character.toUpperCase(data);
            System.out.println("The Upper case of " + Alpha + " is :" + data);
        } else {
            System.out.println("Given Alphabet (" + Alpha + ") is already in Uppercase.");
        }
        */

        //Whether it is a digit,letter or special character
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your Character: ");
        char data = Input.next().charAt(0);
        if (data >= 'a' && data <= 'z' || data >= 'A' && data <= 'Z') {
            System.out.println("Given Character (" + data + ") is a Letter.");
        } else if ( data >= '0' && data <= '9') {
            System.out.println("Given Character (" + data + ") is a Digit.");
        } else {
            System.out.println("Given Character (" + data + ") is a  Special Character.");
        }
        */
        
        //Grade system
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Your Marks :");
        int marks = Input.nextInt();
        int grade = marks/10;
        switch (grade) {
            case 9:
                System.out.println("Your Grade is 'O'. ");
                break;
            case 8:
                System.out.println("Your Grade is 'E'. ");
                break;
            case 7:
                System.out.println("Your Grade is 'A'. ");
                break;
            case 6:
                System.out.println("Your Grade is 'B'. ");
                break;
            case 5:
                System.out.println("Your Grade is 'C'. ");
                break;
            case 4:
                System.out.println("Your Grade is 'D'. ");
                break;
            default:
                System.out.println("Your Grade is 'F'");
                break;
        }
        */

        //Basic Calculator
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Your Numbers :");
        int Num1 = Input.nextInt();
        int Num2 = Input.nextInt();
        System.out.println("1. ADD\n2. Subtract\n3. Multiply\n4. Divide" );
        System.out.print("Enter Your Choice :");
        Scanner Op = new Scanner(System.in);
        int Operation = Op.nextInt();
        switch (Operation) {
            
            case 1:
                int Add = Num1 + Num2;
                System.out.println("Result is " + Add);
                break;
            
            case 2:
                if (Num1 > Num2) {
                    int Subtract = Num1 - Num2;
                    System.out.println("Result is " + Subtract);
                } else {
                    int Subtract = Num2 - Num1;
                    System.out.println("Result is " + Subtract);
                }
                break;
            
            case 3:
                int Multiply = Num1 * Num2;
                System.out.println("Result is " + Multiply);
                break;
            
            case 4:
                if (Num2 == 0) {
                    System.out.println("Error");
                } else {
                    int Divide = Num1 / Num2;
                    System.out.println("Result is " + Divide);
                }
                break;
        
            default:
            System.out.println("You Did Not Select any Choice.");
                break;
        }
        Op.close();
        */

        //Weekday name according to Weekday number
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Weekday Number :");
        int Weekday = Input.nextInt();
        if (Weekday == 0) {
            System.out.println("Invalid Weekday Number.");
        } else {
            switch (Weekday) {
            case 1:
                System.out.println("This is Monday");
                break;
            case 2:
                System.out.println("This is Tuesday");
                break;
            case 3:
                System.out.println("This is Wednesday");
                break;
            case 4:
                System.out.println("This is Thursday");
                break;
            case 5:
                System.out.println("This is Friday");
                break;
            case 6:
                System.out.println("This is Saturday");
                break;
            case 7:
                System.out.println("This is Sunday");
                break;
            default:
            System.out.println("Please Enter a  Valid Weekday Number.");
                break;
            }
        }
        */

        //Calculator with Symbol input
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Your Numbers :");
        int Num1 = Input.nextInt();
        int Num2 = Input.nextInt();
        System.out.println("1. +\n2. -\n3. *\n4. /\n5. %" );
        System.out.print("Enter Your Choice :");
        Scanner Op = new Scanner(System.in);
        int Operation = Op.next().charAt(0);
        switch (Operation) {
            
            case 43:
                int Add = Num1 + Num2;
                System.out.println("Result is " + Add);
                break;
            
            case 45:
                if (Num1 > Num2) {
                    int Subtract = Num1 - Num2;
                    System.out.println("Result is " + Subtract);
                } else {
                    int Subtract = Num2 - Num1;
                    System.out.println("Result is " + Subtract);
                }
                break;
            
            case 42:
                int Multiply = Num1 * Num2;
                System.out.println("Result is " + Multiply);
                break;
            
            case 47:
                if (Num2 == 0) {
                    System.out.println("Error");
                } else {
                    int Divide = Num1 / Num2;
                    System.out.println("Result is " + Divide);
                }
                break;
            case 37:
                if (Num2 == 0) {
                    System.out.println("Error");
                } else {
                    int Remainder = Num1 % Num2;
                    System.out.println("Result is " + Remainder);
                }
                break;
        
            default:
            System.out.println("You Did Not Select any Choice.");
                break;
        }
        Op.close();
        */

        //Valid triangle or not and Classify
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Sides of Triangle :");
        int a = Input.nextInt();
        int b = Input.nextInt();
        int c = Input.nextInt();
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            if ( a == b && b == c) {
                System.out.println("This is an Equilateral Triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("This is a Isosceles Triangle."); 
            } else if ( 
                Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2) ||
                Math.pow(b,2) == Math.pow(a,2) + Math.pow(c,2) ||
                Math.pow(c,2) == Math.pow(b,2) + Math.pow(a,2)){
                System.out.println("The is a Right-Angled Triangle.");
            } else {
                System.out.println("This is a Scalene Traingle.");
            }
        } else {
            System.out.println("Triangle is Invalid");
        }
        */

        //Roots of a Quadratic Equation
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Values of a, b and c according to Quadratic Equation (ax^2+bx+c=0) :");
        int a = Input.nextInt();
        int b = Input.nextInt();
        int c = Input.nextInt();
        double discriminant = Math.pow(b,2) - (4 * a * c);
        if (a == 0 && b == 0) {
            System.out.println("No Solution of Quadratic Equation.");
        } else if (discriminant == 0) {
            double root = b/2;
            System.out.println("The Roots of Quadratic Equation are Equal and Root is :" + root);
        } else if (discriminant < 0) {
            System.out.println("The Roots of Quadratic Equation are Imaginary.");
        } else {
            double root1 = (b + Math.sqrt(discriminant))/2;
            double root2 = (b - Math.sqrt(discriminant))/2;
            System.out.println("Quadratic Equation have Real and Unequal Roots : " + root1 + " and " + root2);
        } 
        */

        //Find Leap Year
        
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Year:");
        int year = Input.nextInt();
        if (year % 400 == 0) { //important
            System.out.println(year + " is a Leap Year.");
        } else if (year % 4 == 0 && year % 100 != 0) { //important
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        
        Input.close();
    }
}