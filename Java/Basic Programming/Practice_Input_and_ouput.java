import java.util.Scanner;

public class Practice_Input_and_ouput {
    public static void main(StringPractice[] args) {
        
        //Hello World
        System.out.println("Hello World");
        Scanner Input = new Scanner(System.in);
        int var1 = Input.nextInt();
        System.out.println("Entered Input is :" + var1);
        
        //Sum of two integers
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int var1 = Input.nextInt();
        int var2 = Input.nextInt();
        int sum = var1 + var2;
        System.out.println("The Sum is : " + sum);
        */

        //centigrade to farhenheit
        /*
        Scanner blu = new Scanner(System.in);
        System.out.print("Enter Your Temperataure in Centigrade :");
        int temp = blu.nextInt();
        int newtemp = (temp * 9/5) + 32;
        System.out.println("Temperature in farhenhiet is :" + newtemp);
        */

        //Calculate the area of circle
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your Radius :");
        float Radius = Input.nextFloat();
        float Area = (Radius * Radius) * 22/7;
        System.out.println("Your Area is :" + Area);
        */
        
        //Calculate the area of triangle
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Height of Triangle :");
        float Height = Input.nextFloat();
        System.out.print("Enter the Base of Triangle :");
        float Base = Input.nextFloat();
        float Area = (Base * Height) * 1/2;
        System.out.println("The Area of Triangle is : " + Area);
        */

        //Swap numbers using third variable
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the First No. :");
        int a = Input.nextInt();
        System.out.print("Enter the Second No. :");
        int b = Input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swapping");
        System.out.println("The First No. :" + a);
        System.out.println("The Second No. :"  + b);
        */

        //Farhenheit to Centigrade
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Your Temperataure in Farhenheit :");
        int temp = Input.nextInt();
        int newtemp = (temp - 32) * 5/9;
        System.out.println("Temperature in Centigrade is :" + newtemp);
        */

        //Swap two numbers without third variable
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the First No. :");
        int a = Input.nextInt();
        System.out.print("Enter the Second No. :");
        int b = Input.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping");
        System.out.println("The First No. :" + a);
        System.out.println("The Second No. :"  + b);
        */

        //Average and Percentage
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Your Marks of 5 Subjects :");
        int a = Input.nextInt();
        int b = Input.nextInt();
        int c = Input.nextInt(); 
        int d = Input.nextInt();
        int e = Input.nextInt();
        int Total = a + b + c + d + e;
        int Average = Total/5;
        double Percentage = Total/10;
        System.out.println("The Average Mark is :" + Average);
        System.out.print("The Percentage is :" + Percentage);
        System.out.println("%");
        */

        //Amount in rupees and paisa
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your Amount :");
        int amount = Input.nextInt();
        int rupees = amount/100;
        int paisa = amount - (rupees * 100);
        System.out.print("Entered Amount is :" + rupees);
        System.out.print(" Rupees");
        System.out.print(" and " + paisa);
        System.out.println(" Paisa");
        */

        //Area of Triangle with 3 Known sides
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter First Side Of Triangle :");
        int a = Input.nextInt();
        System.out.print("Enter Second Side Of Triangle :");
        int b = Input.nextInt();
        System.out.print("Enter Third Side Of Triangle :");
        int c = Input.nextInt();
        int s = (a + b + c) *1/2;
        float Area = s * (s-a) * (s-b) * (s-c);
        System.out.print("Area of Triangle is :" + Math.sqrt(Area));
        */

        Input.close();
    }
}
