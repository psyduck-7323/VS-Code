import java.util.Arrays;
import java.util.Scanner;
public class ArraywithFunctions {

    //design a user defined function to calculate the sum of the elements of an integer array.
    /*
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int Size = Input.nextInt();
        int Array[] = new int[Size];
        System.out.print("Enter Elements of Array :");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Input.nextInt();
        }
        int Sum = Sum(Array);
        System.out.println("Sum of Elements of Array is :" + Sum);
        Input.close();
    }
    public static int Sum (int Array[]) {
        int Sum = 0;
        for (int i = 0; i < Array.length; i++) {
            Sum += Array[i] ;
        }
        return Sum;
    }
    */

    //sort the elements of an array in ascending order by using a suitable user defined function and one to display the array.
    /*
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int Size = Input.nextInt();
        int Array[] = new int[Size];
        System.out.print("Enter Elements of Array :");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Input.nextInt();
        }
        SortArray(Array);
        System.out.print("Array after Sorting :");
        System.out.printArray(Array);
        Input.close();
    }
    public static void SortArray(int Array[]) {
        boolean swap = false;
        for (int j = 0; j < Array.length; j++) {
            for (int i = 0; i < Array.length - 1; i++) {
                if (Array[i] > Array[i+1]) {
                    Array[i] = Array[i] + Array[i+1];
                    Array[i+1] = Array[i] - Array[i+1];
                    Array[i] = Array[i] - Array[i+1];
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
            
    }
    public static void System.out.printArray(int Array[]) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
    */

    //Determine the largest and smallest element of a 1-D array Using functions findLargest and findSmallest for the given purpose.
    /* 
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int Size = Input.nextInt();
        int Array[] = new int[Size];
        System.out.print("Enter Elements of Array :");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Input.nextInt();
        }
        int Largest = findLargest(Array);
        int Smallest = findSmallest(Array);
        System.out.println("Largest Element is :" + Largest + " and Smallest Element is :" + Smallest);
        Input.close();
    }
    public static int findLargest (int Array[]) {
        int largest = 0;
        Arrays.sort(Array);
        for (int i = 0; i < Array.length; i++) {
            if (i == Array.length - 1) {
                largest = Array[i];
            }
        }
        return largest;
    }
    public static int findSmallest (int Array[]) {
        int smallest = 0;
        Arrays.sort(Array);
        for (int i = 0; i < Array.length; i++) {
            if (i == 0) {
                smallest = Array[i];
            }
        }
        return smallest;
    }
    */
    
    //find the sum of only prime values present in a 1-D array using a function primeSum and also use isPrime to check a prime number. 
    /*
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int Size = Input.nextInt();
        int Array[] = new int[Size];
        System.out.print("Enter Elements of Array :");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Input.nextInt();

        }
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            if (isPrime(Array[i]) == true) {
                count++;
            }
        }
        int index = 0;
        int PrimeArray[] = new int[count];
        for (int i = 0; i < Array.length; i++) {
            if (isPrime(Array[i]) == true) {
                PrimeArray[index] = Array[i];
                index++;
            }
        }
        System.out.println("Sum of Prime Numbers in Array is :" + primeSum(PrimeArray));
        Input.close();
    }
    
    public static boolean isPrime(int x) {
        boolean prime = true;
        if (x < 2) {
            prime = false;
        } else if (x == 2) {
            prime = true;
        } else if (x > 2) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
    public static int primeSum(int Array[]) {
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        return sum;
    }
    */

    //WAP to reverse the elements of a single dimensional array using a function. Use function revArr to reverse the array elements.
    /*
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int Size = Input.nextInt();
        int Array[] = new int[Size];
        System.out.print("Enter Elements of Array :");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Input.nextInt();
        }
        int reverse[] = revArr(Array, Size);
        System.out.print("Array After Reverse is :");
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
        Input.close();
    }
    public static int[] revArr(int Array[] , int x) {
        int reverse[] = new int[x];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = Array[x - 1 - i];   
        }
        return reverse;
    }
    */

    //read two single dimensional arrays, multiply Them element-wise and System.out.print the result using three functions.
    /*
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size of 1-D Arrays :");
        int Size = Input.nextInt();
        int Array1[] = new int[Size];
        System.out.print("Enter Elements of First Array :");
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = Input.nextInt();
        }
        int Array2[] = new int[Size];
        System.out.print("Enter Elements of Second Array :");
        for (int i = 0; i < Array2.length; i++) {
            Array2[i] = Input.nextInt();
        }
        int Multiply[] = mulArr(Array1, Array2, Size);
        System.out.print("After Multiplication Array is :");
        System.out.printArray(Multiply);
        Input.close();
    }
    public static int[] mulArr(int Array1[], int Array2[], int x) {
        int multiply[] = new int[x];
        for (int i = 0; i < x; i++) {
            multiply[i] = Array1[i] * Array2[i];
        }
        return multiply;
    }
    public static void System.out.printArray(int Array[]) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
    */

    //find the sum of only odd values in a 1-D array using a function oddSum.
    /*
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int Size = Input.nextInt();
        int Array[] = new int[Size];
        System.out.print("Enter Elements of Array :");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Input.nextInt();
        }
        System.out.println("The Sum ODD Elements of Array is :" + oddSum(Array));
        Input.close();
    }
    public static int oddSum(int Array[]) {
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 != 0) {
                sum += Array[i];
            }
        }
        return sum;
    }
    */

    //swap the largest and smallest element of a 1-D array using a function swap.
    /*
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int Size = Input.nextInt();
        int Array[] = new int[Size];
        System.out.print("Enter Elements of Array :");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Input.nextInt();
        }
        Array = swap(Array);
        System.out.print("Array After sorting :");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        Input.close();
    }
    public static int[] swap(int Array[]) {
        Arrays.sort(Array);
        for (int i = 0; i < Array.length; i++) {
            if (i == 0) {
                int temp = Array[i];
                Array[i] = Array[Array.length - 1];
                Array[Array.length - 1] = temp;    
            }
        }
        return Array;
    }
    */

    //determine the second largest element of a 1-D array of using a function secondLargest.
    /*
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int Size = Input.nextInt();
        int Array[] = new int[Size];
        System.out.print("Enter Elements of Array :");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Input.nextInt();
        }
        System.out.println("Second Largest Element in Array is :" + secondLargest(Array));
        Input.close();
    }
    public static int secondLargest(int Array[]) {
        Arrays.sort(Array);
        int secondlargest = 0;
        for (int i = 0; i < Array.length; i++) {
            secondlargest = Array[Array.length - 2];
        }
        return secondlargest;
    }
    */

    //search a particular element in a given array using a function linearSearch. It should return 1 or 0 depending on the element found
    /*
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int Size = Input.nextInt();
        int Array[] = new int[Size];
        System.out.print("Enter Elements of Array :");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Input.nextInt();
        }
        System.out.print("Enter element to be searched :");
        int element = Input.nextInt();
        int result = linearSearch(Array, element);
        if (result == 1) {
            System.out.println("Element found in Array.");
        } else {
            System.out.println("Element is not in Array.");
        }
        Input.close();
    }
    public static int linearSearch(int Array[], int x) {
        int result = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == x) {
                result = 1;
                break;
            }
        }
        return result;
    }
    */

    //move all zeroes to the end of a given array using a function moveZeros. -[IMPORTANT]
    /*
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int Size = Input.nextInt();
        int Array[] = new int[Size];
        System.out.print("Enter Elements of Array :");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Input.nextInt();
        }
        int newArray[] = moveZeroes(Array);
        System.out.print("Array After Moving Zeroes to end :");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        Input.close();
    }
    public static int[] moveZeroes(int Array[]) { //Important understanding issues (Copied from AI)
        int nonZeroCount = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] != 0) {
                Array[nonZeroCount++] = Array[i];
            }
        }
        while (nonZeroCount < Array.length) {
            Array[nonZeroCount++] = 0;
        }
        return Array;
    }
    */

    //find the median of an array using a function findMedian.
    
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int Size = Input.nextInt();
        int Array[] = new int[Size];
        System.out.print("Enter Elements of Array :");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Input.nextInt();
        }
        System.out.println("Median of Given Array is :" + findMedian(Array, Size));
        Input.close();
    }
    public static float findMedian(int Array[] , int Size) {
        Arrays.sort(Array);
        float Median = 0;
        int n = Size;
        if (Size == 1) {
            Median = Array[0];
        } else {
            if (Size % 2 == 0) {
                Median = (Array[(n / 2) - 1] + Array[n / 2 ]) / 2.0f;
            } else {
                int i = (n + 1) / 2;
                Median = Array[i - 1];
            } 
        }
        return Median;
    }
    
    
}

