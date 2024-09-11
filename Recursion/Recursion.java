public class Recursion {
    /*public static void decreasingNumber(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        decreasingNumber(n-1);
    }
    public static void increasingNumber(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        increasingNumber(n-1);
        System.out.print(n+" ");
    }
    public static int factorialNum(int n){
        if(n == 0 | n == 1){
            return 1;
        }
        int f = factorialNum(n-1);
        return f * n;

    }
    public static int SumN(int n){
        if(n == 1){
            return 1;
        }
        int sum = SumN(n-1);
        return n + sum;
    }
    public static int fibonacciNum(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f1 = fibonacciNum(n-1);
        int f2 = fibonacciNum(n-2);
        int fib = f1 + f2;
        return fib;
    }
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    public static int lastOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int x1 = power(x, n-1);
        int xn = x * x1;
        return xn;
    }
    public static int optimiziedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        //n is even
        int halfPower = optimiziedPower(x, n/2);
        int h = halfPower * halfPower;
        //n is odd
        if(n % 2 != 0){
            h = x * h;
        }
        return h;
    }
    public static void removeDuplicates(String str, int idx, StringBuilder sb, boolean map[]){
        if(idx == str.length()){
            System.out.println(sb);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, sb, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, sb.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "apnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(optimiziedPower(2, 10));
        //System.out.println(power(2, 10));
        // int arr[] = {1, 2, 3, 4, 5, 4, 7};
        // System.out.println(lastOcc(arr, 4, 0));
        //System.out.println(firstOcc(arr, 7, 0));
        //System.out.println(isSorted(arr, 0));
        // int n = 5;
        // System.out.println(fibonacciNum(n));
        // System.out.println(SumN(n));
        // System.out.println(factorialNum(n));
        // increasingNumber(n);
        // decreasingNumber(n);
    }*/
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void printDigits(int number){
        //base case
        if(number == 0){
            return;
        }
        //kaam
        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+ " ");
    }
    public static void keyOccurrences(int arr[], int key, int i){
        //base case
        if(i == arr.length){
            return;
        }
        //kaam
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        keyOccurrences(arr, key, i+1);
    }
    public static int length(String str){
        if(str.length() == 0){
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
    public static int countSubStr(String str, int i, int j, int n){
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 0;
        }

        int res = countSubStr(str, i+1, j, n-1) + countSubStr(str, i, j-1, n-1) - countSubStr(str, i+1, j-1, n-2);
        // Recursive case:
        // - countSubStr(str, i+1, j, n-1): Count substrings excluding the first character.
        // - countSubStr(str, i, j-1, n-1): Count substrings excluding the last character.
        // - countSubStr(str, i+1, j-1, n-2): Count substrings excluding both the first and last characters.

        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest){
        //base case
        if(n == 1){
            System.out.println("transfer disk: "+n+" from "+src+" to "+dest);
            return;
        }
        //kaam
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key = 2;
        // keyOccurrences(arr, key, 0);

        // printDigits(2019);

        // String str = "Samruddhi";
        // System.out.println(length(str));

        // String str = "abcab";
        // int n = str.length();
        // System.err.println(countSubStr(str, 0, n-1, n));

        int n = 2;
        towerOfHanoi(n, "S","H", "D");
    }
}
