import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        //Rectangle of Stars
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row and Coloumn):");
        int r = Input.nextInt();
        int c = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1 ; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        
        //Hollow Rectangle of Stars
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row and Coloumn):");
        int r = Input.nextInt();
        int c = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1 ; j <= c; j++) {
                if  (i == 1|| j == 1 || i == r || j == c) {
                    System.out.print("*");  
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
        */
        
        //Half Pyramid of Stars
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        //Inverted Half Pyramid of Stars
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        //Inverted Half Pyramid of Stars (Rotated by 180)
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        */

        //Half Pyramid of Stars (Rotated by 180)
        /* 
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
            
            System.out.println();
        }
        */
        
        //Half Pyramid of Numbers
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        //Inverted Half Pyramid of Numbers
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= ( r - i + 1 ); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        //Floyd's Triangle
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        int Number = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(Number + " ");
                Number++;
            }
            System.out.println();
        }
        */

        //0 , 1 Triangle
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }   
            }
            System.out.println();
        }
        */

        //Number Pyramid
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        */
        
        // Star Rhombus
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        */
        
        //Number Pyramid
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        */

        //Number Palindrome Pyramid
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        */

        // Butterfly Pattern
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * (r - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = r; i >= 1; i--) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * (r - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        
        //Diamond Pattern
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = r - 1; i >= 1; i--) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        */
        
        //Inverted Half Pyramid of Numbers
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= r - i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        */
        
        //System.out.print Half Pyramid
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */
        
        //Hollow Rhombus
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= r; j++) {
                if (i == 1 || i == r || j == 1 || j == r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }
        */
        
        // Pascal Triangle (Important *_*)
        /*
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 0; i < r; i++) {
            int value = 1;  // Initialisation For Formula
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);  // Important Formula to be Noticed 
            }
            System.out.println();
        }
        */
        
        //Hollow Butterfly
        
        Scanner Input =  new Scanner(System.in);
        System.out.print("Enter Size of Pattern (Row) :");
        int r = Input.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1 ; j <= i; j++) {
                if ( j == 1 || i == j ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            int space = 2 * (r - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ( j == 1 || i == j ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();    
        }
        for (int i = r; i >= 1; i--) {
            for (int j = 1 ; j <= i; j++) {
                if ( j == 1 || i == j ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            int space = 2 * (r - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ( j == 1 || i == j ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();    
        }
        Input.close();

    }
}
