import java.util.Scanner;
import java.lang.StringBuilder;

public class StringPractice {
    public static void main(String[] args) {
        
        //find the length of a string with and without using a library
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = Input.nextLine();
        System.out.println(str.length());//Using a Library
        String length = "";
        int Counter = 0;
        for (int i = 0; i < str.length(); i++) {
            length += str.charAt(i);
            Counter++;
        }
        System.out.println(length + " have String length of " + Counter);//Without Using a Library
        */

        //copy one string into another with and without using a library function
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = Input.nextLine();
        String copy = str;//Without Library
        System.out.println(copy);
        */

        //find the reverse of a string with and without using a library function.
        
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = Input.nextLine();
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse += str.charAt(str.length() - 1 - i);//Without Library
        }
        System.out.println("Reverse of String is :" + reverse);
        

        //replace all occurrences of a character in a given string with a new character.
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = Input.nextLine();
        System.out.print("Enter the Character to be Replaced :");
        char old = Input.next().charAt(0);
        System.out.print("Enter the Character to be Replace by:");
        char replace = Input.next().charAt(0);
        String newstr = str.replace(old, replace);
        System.out.println("New String is :" + newstr);
        */

        //extract the first character of each word of a given string.
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = Input.nextLine();
        char space = ' ';
        String newstr = "";
        boolean first = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == space) {
                first = true;
            } else if (first == true || i == 0) {
                newstr += str.charAt(i);
                first = false;
            }
        }
        System.out.println(newstr);
        */

        //compare two string with and without using a library function
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the First String :");
        String str1 = Input.nextLine();
        System.out.print("Enter the Second String :");
        String str2 = Input.nextLine();
        int check = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                continue;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                check = 1;
                break;
            } else if (str1.charAt(i) < str2.charAt(i)) {
                check = -1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("Both Strings are Equal.");
        } else if (check == 1) {
            System.out.println("First String is Greater Than Second String.");
        } else if (check == -1) {
            System.out.println("Second String is Greater Than First String.");
        }
        */

        //extract the last character of each word of a given string.
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = Input.nextLine();
        char space = ' ';
        String newstr = "";
        boolean first = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == space) {
                first = true;
            } else if (first == true || i == str.length() - 1) {
                newstr += str.charAt(i);
                first = false;
            }
        }
        String revstr = new StringBuilder(newstr).reverse().toString();
        System.out.println(revstr);
        */

        //concatenate two strings without using any library function.
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the First String :");
        String str1 = Input.nextLine();
        System.out.print("Enter the Second String :");
        String str2 = Input.nextLine();
        String add = "";
        add = str1 + str2;
        System.out.println("String after addition of two Strings :" + add);
        */

        //check whether a string entered through keyboard is palindrome or not.
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = Input.nextLine();
        boolean counter = true;
        for (int i = 0; i < str.length() / 2; i++) {
            char l1 = str.charAt(i);
            char l2 = str.charAt(str.length() - 1 - i);
            if (l1 != l2) {
                counter = false;
                break;
            }
        }
        if (counter == true) {
            System.out.println("Given String is Palindrome.");
        } else {
            System.out.println("Given String is not a Palindrome.");
        }
        */

        //read a sentence and System.out.print frequency of each of the vowels and total count of consonants present in it.
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = Input.nextLine();
        int consonants = 0;
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < str.length(); j++) {
            char letter = Character.toLowerCase(str.charAt(j));
            if ( letter == 'a' || letter == 'e' ||letter == 'i' ||letter == 'o' ||letter == 'u' )  {
                switch (letter) {
                    case 'a':
                        a++;
                        break;
                    case 'e':
                        e++;
                        break;
                    case 'i':
                        i++;
                        break;
                    case 'o':
                        o++;
                        break;
                    case 'u':
                        u++;
                        break;
                    default:
                        break;
                }
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels used in String as Followed :" );
        System.out.println("'A' = " + a + " 'E' = " + e + " 'I' = " + i + " 'O' = " + o + " 'U' = " + u);
        System.out.println("Total Count of Consonants used in Strings are :" + consonants);
        */
        
        //capitalize first character of each word of a string entered through keyboard.
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Old String :");
        String str = Input.nextLine();
        char space = ' ';
        String newstr = "";
        boolean first = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == space) {
                first = true;
                newstr += str.charAt(i);
            } else if (first == true || i == 0) {
                newstr += Character.toUpperCase(str.charAt(i));
                first = false;
            } else {
                newstr += str.charAt(i);
            }
            
        }
        System.out.println("New String :" + newstr);
        */

        //extract a sub-string from a given string. Prompt the user to enter the starting position and length of the sub-string.
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = Input.nextLine();
        String substr = "";
        System.out.print("Enter the Starting Position of Sub-String:");
        int Start = Input.nextInt();
        System.out.print("Enter the Length of Sub-String:");
        int End = Input.nextInt();
        for (int i = Start - 1; i < Start + End; i++) {
            substr += str.charAt(i); 
        }
        System.out.println("The Sub-String is :" + substr);
        */

        Input.close(); 
    }
}
