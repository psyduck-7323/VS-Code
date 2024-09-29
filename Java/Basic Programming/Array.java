import java.util.Scanner;
//import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //Array to Store Integers and Display it
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Integers[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Integers[i] = Input.nextInt();
        }
        for (int i = 0; i < Size; i++) {
            System.out.print(Integers[i] + " ");
        }
        */

        //Sum of Integers Stored in Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Integers[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Integers[i] = Input.nextInt();
        }
        int Sum = 0;
        for (int i = 0; i < Size; i++) {
            Sum += Integers[i];
        }
        System.out.println("The Sum Integers Stored in Array is :" + Sum);
        */
        
        //Finding Element Stored in Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Integers[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Integers[i] = Input.nextInt();
        }
        System.out.print("Enter the Number to Search :");
        int Find = Input.nextInt();
        int counter = 0;
        for (int i = 0; i < Size; i++) {
            int Search = Integers[i];
            if (Find == Search) {
                counter = 1;
                System.out.println("The Entered Number " + Find + " is Found at " + (i+1) + " Position");
                break;
            } else {
                continue;
            }
        }
        if (counter == 0) {
            System.out.println("The Entered Number " + Find + " is Not in Array");
        }
        */

        //Replace Element in a Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Integers[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Integers[i] = Input.nextInt();
        }
        System.out.print("Enter Number to be Inserted :");
        int Replace = Input.nextInt();
        System.out.print("Enter Position Where Number to be Replaced :");
        int P = Input.nextInt();
        System.out.print("Old Array :");
        for (int i = 0; i < Size; i++) {
            System.out.print(Integers[i] + " ");
        }
        for (int i = 0; i < Size; i++) {
            if (i == (P - 1)) {
                Integers[i] = Replace;
            }
        }
        System.out.println();
        System.out.print("New Array :");
        for (int i = 0; i < Size; i++) {
            System.out.print(Integers[i] + " ");
        }
        */

        //Average of Elements in a Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        float Integers[] = new float[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Integers[i] = Input.nextInt();
        }
        float Sum = 0;
        for (int i = 0; i < Size; i++) {
            Sum += Integers[i];
        }
        float Average = Sum / Size;
        System.out.println("The Sum Integers Stored in Array is :" + Average);
        */

        //Even And Odd
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Integers[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Integers[i] = Input.nextInt();
        }
        System.out.print("Even Numbers in Array are :");
        for (int i = 0; i < Integers.length; i++) {
            if (Integers[i] % 2 == 0) {
                System.out.print(Integers[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Odd Numbers in Array are :");
        for (int i = 0; i < Integers.length; i++) {
            if (Integers[i] % 2 != 0) {
                System.out.print(Integers[i] + " ");
            }
        }
        */

        //Multipy and New Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Number1[] = new int[Size];
        System.out.print("Enter the Elements of First Array :");
        for (int i = 0; i < Size; i++) {
            Number1[i] = Input.nextInt();
        }
        int Number2[] = new int[Size];
        System.out.print("Enter the Elements of Second Array :");
        for (int i = 0; i < Size; i++) {
            Number2[i] = Input.nextInt();
        }
        int Integers[] = new int[Size];
        for (int i = 0; i < Integers.length; i++) {
            Integers[i] = Number1[i] * Number2[i];
        }
        System.out.print("The New Array After Multiplication is :");
        for (int i = 0; i < Size; i++) {
            System.out.print(Integers[i] + " ");
        }
        */

        //Reverse of Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        int Reverse[] = new int[Size];
        for (int i = 0; i < Size; i++) {
            Reverse[i] = Original[Size - 1 - i];
        }
        for (int i = 0; i < Size; i++) {
            System.out.print(Reverse[i] + " ");
        }
        */
        
        //Delete Element in Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        System.out.print("Enter the Postion Where Element have to be Deleted :");
        int Position = Input.nextInt() - 1;
        int New[] = new int[Size - 1];
        for (int i = 0; i < Position; i++) {
            New[i] = Original[i];
        }
        for (int i = Position + 1; i < Size; i++) {
            New[i - 1] = Original[i];
        }
        for (int i = 0; i < Size - 1; i++) {
            System.out.print(New[i] + " ");
        }
        */

        //Inserting Element in Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        System.out.print("Enter Element to be Inserted :");
        int Element = Input.nextInt();
        System.out.print("Enter the Postion Where Element have to be Inserted :");
        int Position = Input.nextInt();
        int New[] = new int[Size + 1];
        for (int i = 0; i < Position; i++) {
            New[i] = Original[i];
        }
        New[Position] = Element;
        for (int i = Position; i < Size; i++) {
            New[i + 1] = Original[i];
        }
        for (int i = 0; i < Size + 1; i++) {
            System.out.print(New[i] + " ");
        }
        */
        
        //swap the pair of elements starting from the beginning
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        int temp = 0;
        int End = 0;
        if (Size % 2 != 0) {
            End = Size - 1;
        } else {
            End = Size;
        }
        for (int i = 0; i < End; i++) {
            temp = Original[i + 1];
            Original[i+1] = Original[i];
            Original[i] = temp;
            i++;
        }
        for (int i = 0; i < Size; i++) {
            System.out.print(Original[i] + " ");
        }
        */
        
        //Largest Element in Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        int Large = Original[0];
        for (int i = 0; i < Original.length; i++) {
            if (Original[i] > Large) {
                Large = Original[i];
            }
        }
        System.out.println("Largest Element in Array is :" + Large);
        */

        // Largest Even Element in Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        int Large = Original[0];
        for (int i = 0; i < Original.length; i++) {
            if (Original[i] > Large && Original[i] % 2 == 0) {
                Large = Original[i];
            }
        }
        System.out.println("Largest Even Element in Array is :" + Large);
        */

        //Sort array in Ascending order
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        Arrays.sort(Original);
        for (int i = 0; i < Size; i++) {
            System.out.print(Original[i] + " ");
        }
        */
        
        //Standard Deviation
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Integers[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Integers[i] = Input.nextInt();
        }
        int Sum = 0;
        for (int i = 0; i < Size; i++) {
            Sum += Integers[i];
        }
        double Mean = Sum / Size;
        double Deviation = 0;
        for (int i = 0; i < Size; i++) {
            double Sun = Integers[i] - Mean;
            Deviation = Deviation + Math.pow(Sun, 2);
        }
        double SD = Deviation / (Size - 1);
        double Standard = Math.sqrt(SD); 
        System.out.println("The Standard Deviation of Integers Stored in Array is :" + Standard);
        */

        //Sort two Arrays and Merge it into Third Array 
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size1 = Input.nextInt();
        int Original1[] = new int[Size1];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size1; i++) {
            Original1[i] = Input.nextInt();
        }
        Arrays.sort(Original1);
        System.out.print("Enter the Second Array Size :");
        int Size2 = Input.nextInt();
        int Original2[] = new int[Size2];
        System.out.print("Enter the Elements of Second Array :");
        for (int i = 0; i < Size2; i++) {
            Original2[i] = Input.nextInt();
        }
        Arrays.sort(Original2);
        for (int i = 0; i < Original1.length; i++) {
            System.out.print(Original1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < Original2.length; i++) {
            System.out.print(Original2[i] + " ");
        }
        int Merge[] = new int[Size1 + Size2];
        System.arraycopy(Original1, 0, Merge, 0, Size1);
        System.arraycopy(Original2, 0, Merge, Size1, Size2);
        Arrays.sort(Merge);
        System.out.println();
        for (int i = 0; i < Merge.length; i++) {
            System.out.print(Merge[i] + " ");
        }
        */
        
        //Second Largest Element in a Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        Arrays.sort(Original);
        System.out.print("Second Largest Element in Array is :" + Original[Size - 2]);
        */

        //Array in Descending Order
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        int Temp = Original[0];
        for (int i = 0; i < Original.length - 1; i++) {
            for (int j = 0; j < Original.length - i - 1; j++) {
                if (Original[j] < Original[j + 1]) { // > for Ascending Order & < for Descending Order
                    Temp = Original[j];
                    Original[j] = Original[j + 1];
                    Original[j + 1] = Temp;
                }
            }
        }
        for (int i = 0; i < Size; i++) {
            System.out.print(Original[i] + " ");
        }
        */

        //Rotate Array by D-position
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        System.out.print("Enter the D-Position from where Array to be Rotated :");
        int Position = Input.nextInt();
        int Rotated[] = new int[Size];
        int j = 0;
        for (int i = Position - 1; i < Size; i++) {
            Rotated[j] = Original[i];
            j++;
        }
        for (int i = 0; i < Position - 1; i++) {
            Rotated[j] = Original[i];
            j++;
        }
        System.out.print("Rotated Array from D-Position is :");
        for (int i = 0; i < Rotated.length; i++) {
            System.out.print(Rotated[i] + " ");
        }
        */
        
        //Median in Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        Arrays.sort(Original);
        float Median = 0;
        int n = Size;
        if (Size == 1) {
            Median = Original[0];
        } else {
            if (Size % 2 == 0) {
                Median = (Original[(n / 2) - 1] + Original[n / 2 ]) / 2.0f;
            } else {
                int i = (n + 1) / 2;
                Median = Original[i - 1];
            } 
        }
        System.out.println("Median of Given Array is :" + Median);
        */

        //Majority Element - A majority element in an array A of size n is an element that appears more than n/2 times in the array.
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        int counter = 0;
        int temp = 0;
        for (int i = 0; i < Original.length; i++) {
            if (temp == Original[i]) {
                continue;
            } else {
                for (int k = 0; k < Original.length; k++) {
                    if (Original[i] == Original[k]) {
                        counter++;
                    }
                }
                if (counter > Size/2) {
                    temp = Original[i];
                } 
            }
        }
        if (counter == 1) {
            System.out.println("No Majority Element Found.");
        } else {
            System.out.println("Majority Element in Array is :" + temp);
        }
        */

        //Leader Element - An element of an array is a leader if it is greater than or equal to all the elements present after it.
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        System.out.print("The Leader Element in Array are :");
        boolean Counter = true;
        for (int i = 0; i < Original.length - 1; i++) {
            Counter = true;
            for (int j = i + 1; j < Original.length - 1; j++) {
                if (Original[i] < Original[j]) {
                    Counter = false;
                    break;
                }
            }
            if (Counter == true) {
                System.out.print(Original[i] + " ");
            }
        }
        */

        //Peak Element - A peak element is an element that is greater than its neighbors.
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        System.out.println("Peak Numbers in a Array are :");
        for (int i = 0; i < Original.length - 1; i++) {
            if (Original[i + 1] > Original[i] && Original[i + 1] > Original[i + 2]) {
                System.out.print(Original[i + 1] + " ");
            }
        }
        */

        //Delete Duplicate Element in Array
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = Input.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = Input.nextInt();
        }
        int counter = 0; //Checking no. of Duplicate Elements
        for (int i = 0; i < Original.length; i++) {
            for (int j = i + 1; j < Original.length; j++) {
                if (Original[i] == Original[j]) {
                    counter++;
                    break;
                }
            }
        }
        int length = Size - counter; //Updating New Array Size  
        int New[] = new int[length]; //Deleting Duplicate Elements
        int index = 0;//created new index so that can act independednt of loop
        for (int i = 0; i < Original.length - 1; i++) {// limited size by -1 so that out of bound error don't occur
            Boolean Duplicate = false;
            for (int j = i + 1; j < Size - 1; j++) {
                if (Original[i] == Original[j]) {
                    Duplicate = true;
                    break;
                }
            }
            if (Duplicate == false){
                New[index++] = Original[i];
            }
        }
        System.out.print("New Array After deleting Duplicate Elements :");
        for (int i = 0; i < length; i++) {
            System.out.print(New[i] + " ");
        }
        */
        
        // Find sub-array that adds to a given sum
        /*
        Scanner art = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int Size = art.nextInt();
        int Original[] = new int[Size];
        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < Size; i++) {
            Original[i] = art.nextInt();
        }
        System.out.print("Enter the Sum :");
        int Input_Sum = art.nextInt();
        int i = 0, j = 0;
        for (i = 0; i < Original.length; i++) {
            int Matrix_Sum = 0;
            for (j = i; j < Original.length; j++) {
                Matrix_Sum += Original[j];
                if (Matrix_Sum >= Input_Sum) {
                    break;
                }
            }
            if (Matrix_Sum == Input_Sum) {
                break;
            }
        }
        System.out.print("Sub Array Which Adds to " + Input_Sum + " :");
        for (int k = i; k <= j; k++) {
            System.out.print(Original[k] + " ");
        }
        art.close();
        */

    /***********************************************                  2D-Arrays               ********************************************/        
        
        //sum of the elements of matrix
        /*
        Scanner Input =new Scanner(System.in);
        System.out.print("Enter No. of Rows of Matrix :");
        int Row = Input.nextInt();     
        System.out.print("Enter No. of Coloumns of Matrix :");
        int Coloumn = Input.nextInt();
        int Matrix[][] = new int[Row][Coloumn];
        System.out.print("Enter Elements of Matrix :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Coloumn; j++) {
                Matrix[i][j] = Input.nextInt();
            }
        }
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Coloumn; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        int Sum = 0;
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Coloumn; j++) {
                Sum += Matrix[i][j];
            }
        }
        System.out.println("The Sum of All Elements in Matrix is :" + Sum);
        */
        
        //Add two Matrices and Display it
        /*
        Scanner Input =new Scanner(System.in);
        System.out.print("Enter No. of Rows of Matrices :");
        int Row = Input.nextInt();     
        System.out.print("Enter No. of Coloumns of Matrices :");
        int Coloumn = Input.nextInt();
        int Matrix1[][] = new int[Row][Coloumn];
        System.out.print("Enter Elements of Matrix 1 :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Coloumn; j++) {
                Matrix1[i][j] = Input.nextInt();
            }
        }
        int Matrix2[][] = new int[Row][Coloumn];
        System.out.print("Enter Elements of Matrix 2 :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Coloumn; j++) {
                Matrix2[i][j] = Input.nextInt();
            }
        }
        int Sum[][] = new int[Row][Coloumn];
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Coloumn; j++) {
                Sum[i][j] = Matrix1[i][j] + Matrix2[i][j];
            }
        }
        System.out.println("Sum of Two Matrices is :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Coloumn; j++) {
                System.out.print(Sum[i][j] + " ");
            }
            System.out.println();
        }
        */

        //Multiply two matrices - Important
        /*
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter No. of Rows of Matrix 1 :");
        int Row1 = Input.nextInt();     
        System.out.print("Enter No. of Coloumns of Matrix 1 :");
        int Column1 = Input.nextInt();
        int Matrix1[][] = new int[Row1][Column1];
        System.out.print("Enter Elements of Matrix 1 :");
        for (int i = 0; i < Row1; i++) {
            for (int j = 0; j < Column1; j++) {
                Matrix1[i][j] = Input.nextInt();
            }
        }
        System.out.print("Enter No. of Rows of Matrix 2 :");
        int Row2 = Input.nextInt();     
        System.out.print("Enter No. of Coloumns of Matrix 2 :");
        int Column2 = Input.nextInt();
        int Matrix2[][] = new int[Row2][Column2];
        System.out.print("Enter Elements of Matrix 2 :");
        for (int i = 0; i < Row2; i++) {
            for (int j = 0; j < Column2; j++) {
                Matrix2[i][j] = Input.nextInt();
            }
        }
        int Multiplication[][] = new int[Row1][Column2];
        if (Column1 == Row2) {
            for (int i = 0; i < Row1; i++) {
                for (int j = 0; j < Column2; j++) {
                    int Multiply = 0;
                    for (int k = 0; k < Column1; k++) {           //Look out for inner loop
                        Multiply =  Multiply + Matrix1[i][k] * Matrix2[k][j]; //Matrix Updation
                        Multiplication[i][j] = Multiply; 
                    }
                    
                }
            }
            for (int i = 0; i < Row1; i++) {
                for (int j = 0; j < Column2; j++) {
                    System.out.print(Multiplication[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix Multiplication Not Possible as Column of Matrix 1 is Not Equal to Row of Matrix 2.");
        }
        */
        
        //Transpose of a given matrix
        /*
        Scanner Input =new Scanner(System.in);
        System.out.print("Enter No. of Rows and Columns of Matrix :");
        int Row = Input.nextInt();     
        int Matrix[][] = new int[Row][Row];
        System.out.print("Enter Elements of Matrix :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                Matrix[i][j] = Input.nextInt();
            }
        }
        int Transpose[][] = new int[Row][Row];
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                Transpose[j][i] = Matrix[i][j];
            }
        }
        System.out.println("Original Matrix is :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of Given Matrix is :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }
        */
        
        //Sum of elements of upper triangular
        /*
        Scanner Input =new Scanner(System.in);
        System.out.print("Enter No. of Rows and Columns of Matrix :");
        int Row = Input.nextInt();     
        int Matrix[][] = new int[Row][Row];
        System.out.print("Enter Elements of Matrix :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                Matrix[i][j] = Input.nextInt();
            }
        }
        int Sum = 0;
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                if (i == j || i < j) {
                    Sum += Matrix[i][j];
                } 
            } 
        }
        System.out.println("The Sum of Elements of Upper Triangular Matrix is :" + Sum);
        */

        //sum of rows and columns of a matrix.
        /*
        Scanner Input =new Scanner(System.in);
        System.out.print("Enter No. of Rows of Matrix :");
        int Row = Input.nextInt();     
        System.out.print("Enter No. of Coloumns of Matrix :");
        int Column = Input.nextInt();
        int Matrix[][] = new int[Row][Column];
        System.out.print("Enter Elements of Matrix :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                Matrix[i][j] = Input.nextInt();
            }
        }
        for (int i = 0; i < Row; i++) {
            int Row_Sum = 0;
            for (int j = 0; j < Column; j++) {
                Row_Sum =  Row_Sum + Matrix[i][j];
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.print("|" + Row_Sum);
            System.out.println();
        }
        for (int i = 0; i < Column; i++) {
            System.out.print("--");
        }
        System.out.println();
        for (int i = 0; i < Column; i++) {
            int Column_Sum = 0;
            for (int j = 0; j < Row; j++) {
                Column_Sum =  Column_Sum + Matrix[j][i];
            }
            System.out.print(Column_Sum + " ");
        }
        */
        
        //Trace (sum of the diagonal element) of a given n×n Matrix
        /*
        Scanner Input =new Scanner(System.in);
        System.out.print("Enter No. of Rows and Columns of Matrix :");
        int Row = Input.nextInt();     
        int Matrix[][] = new int[Row][Row];
        System.out.print("Enter Elements of Matrix :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                Matrix[i][j] = Input.nextInt();
            }
        }
        int Trace = 0;
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                if (i == j) {
                    Trace += Matrix[i][j];
                }
            }
        }
        System.out.println("Trace of Given Matrix is :" + Trace);
        */
        
        //System.out.print the elements of upper triangular matrix
        /*
        Scanner Input =new Scanner(System.in);
        System.out.print("Enter No. of Rows and Columns of Matrix :");
        int Row = Input.nextInt();     
        int Matrix[][] = new int[Row][Row];
        System.out.print("Enter Elements of Matrix :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                Matrix[i][j] = Input.nextInt();
            }
        }
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                if (i == j || i < j) {
                    System.out.print(Matrix[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        */
        
        //check whether a matrix is identity matrix or not.
        /*
        Scanner Input =new Scanner(System.in);
        System.out.print("Enter No. of Row of Matrix :");
        int Row = Input.nextInt();
        System.out.print("Enter No. of Column of Matrix :");
        int Column = Input.nextInt();     
        int Matrix[][] = new int[Row][Column];
        System.out.print("Enter Elements of Matrix :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                Matrix[i][j] = Input.nextInt();
            }
        }
        boolean identity = false;
        if (Row != Column) {
            System.out.println("Given Matrix is Not an Identity Matrix.");
        } else {
            for (int i = 0; i < Row; i++) {
                for (int j = 0; j < Column; j++) {
                    if ((i == j && i == 0) || (i == 1 && ( i > j || j > i))) {
                        identity = true;
                    }
                }
            }
        }
        if (identity == true) {
            System.out.println("Given Matrix is an Identity Matrix.");
        } else {
            System.out.println("Given Matrix is Not an Identity Matrix.");
        }
        */
        
        //find out the count of even and odd numbers in a matrix.
        /*
        Scanner Input =new Scanner(System.in);
        System.out.print("Enter No. of Rows of Matrix :");
        int Row = Input.nextInt();     
        System.out.print("Enter No. of Columns of Matrix :");
        int Column = Input.nextInt();
        int Matrix[][] = new int[Row][Column];
        System.out.print("Enter Elements of Matrix :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                Matrix[i][j] = Input.nextInt();
            }
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                if (Matrix[i][j] % 2 == 0 || Matrix[i][j] == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Number of Even Elements in Given Matrix is :" + even);
        System.out.println("Number of Odd Elements in Given Matrix is :" + odd);    
        */

        //test whether a square matrix is symmetrical or not (A matrix is symmetrical if it is same as its transpose.)
        /*
        Scanner Input =new Scanner(System.in);
        System.out.print("Enter No. of Rows and Columns of Matrix :");
        int Row = Input.nextInt();     
        int Matrix[][] = new int[Row][Row];
        System.out.print("Enter Elements of Matrix :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                Matrix[i][j] = Input.nextInt();
            }
        }
        int Transpose[][] = new int[Row][Row];
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                Transpose[j][i] = Matrix[i][j];
            }
        }
        boolean Symmetry = true;
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Row; j++) {
                if (Transpose[i][j] != Matrix[i][j]) {
                Symmetry = false;
                break;
                }
            }
            if (Symmetry != false) {
                break;
            }
        }
        if (Symmetry == true) {
            System.out.println("Given Square Matrix is Symmetrical.");
        } else {
            System.out.println("Given Square Matrix is Not Symmetrical.");
        }
        */
        
        //determine whether it is a sparse matrix or not (A martix which has more zero elements than non-zero elements is known as a sparse matrix)
        
        Scanner Input =new Scanner(System.in);
        System.out.print("Enter No. of Row of Matrix :");
        int Row = Input.nextInt();
        System.out.print("Enter No. of Column of Matrix :");
        int Column = Input.nextInt();     
        int Matrix[][] = new int[Row][Column];
        System.out.print("Enter Elements of Matrix :");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                Matrix[i][j] = Input.nextInt();
            }
        }
        int Nozero = 0;
        int Zero = 0;
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                if (Matrix[i][j] == 0) {
                    Zero++;
                } else {
                    Nozero++;
                }
            }
        }
        if (Zero > Nozero) {
            System.out.println("Given Matrix is a Sparse Matrix.");
        } else {
            System.out.println("Given Matrix is Not a Sparse Matrix.");
        }
        
        
        Input.close();
    } 
}
