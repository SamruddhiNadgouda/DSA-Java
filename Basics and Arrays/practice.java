// Basics of JAVA
import java.util.*;

public class practice
{
    /*public static void main(String args[])
    {
        System.out.println("Welcome to My Calculator");
        Scanner sc= new Scanner(System.in);
        String op= sc.next();
        int a= sc.nextInt();
        int b= sc.nextInt();

        switch(op){
            case "+":
                System.out.println("Addition of "+ a +"and"+ b+" is "+ (a+b));
                break;
            case "-":
                System.out.println("Substraction of "+ a +"and"+ b+"  is "+ (a-b));
                break;
            case "*":
                System.out.println("Multiplication of "+ a +"and"+ b+"  is "+ (a*b));
                break;
            case "/":
                System.out.println("Division of "+ a +"and"+ b+" is "+ (a/b));
                break;
            case "%":
                System.out.println("Modular of "+ a +"and"+ b+"  is "+ (a%b));
                break;
            default:
                System.out.println("Invalid");
        }

        //for loop
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }

        //while loop
        int i=0;
        while(i<11){
            System.out.println(i);
            i=i+1;
        }

        //do-while loop
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);

        //sum of n number n=4
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int sum=0;
        for(int i=0; i<=n; i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }

        //Functions

        //sum of two numbers
        public static int sum(int a, int b){
            int s = a+b;
            return s;
        } 
        public static void DisplayName(String name){
            System.out.println("My name is "+name);
            return;
        }
        public static int Average(int a, int b, int c){
            int avg = (a+b+c)/3;
            return avg;
        }
        public static void OddSum(int n){
            int sum = 0;
            for(int i=0; i<=n; i++){
                if(i%2 != 0){
                    sum=sum + i;
                }
            }
            System.out.println(sum);
        }
        public static void Count(int c){
            Scanner sc= new Scanner(System.in);
            int num;
            int p=0;
            int n=0;
            int z=0;
            for(int j=0; j<c; j++){
                num = sc.nextInt();
                if(num > 0){
                    p++;
                }else if(num < 0){
                    n++;
                }else{
                    z++;
                }
            }
            System.out.println("Count of positive numbers is "+p);
            System.out.println("Count of negative numbers is "+n);
            System.out.println("Count of zeros is "+z);
        }
        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);

            //int a= sc.nextInt();
            //int b= sc.nextInt();
            int n= sc.nextInt();
            String s = sc.next();

            int add = sum(a,b);
            System.out.println("Sum of two numbers is "+add);
            System.out.println("Sum of two numbers is "+sum(5,7));
            DisplayName(s); 
            //System.out.println("Average of three numbers is "+Average(a,b,c));
            OddSum(n);
            Scanner sc= new Scanner(System.in);
            int c= sc.nextInt();
            Count(c);
        }
    public static void main(String[] args) {
        /*int[] marks = new int[3];
        marks[0]=97;
        marks[1]=93;
        marks[2]=87;
        //System.out.println(marks);
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("enter numbers: ");
            num[i] = sc.nextInt();
        }
        int x =  sc.nextInt();

        for(int i=0; i<num.length; i++){
            //System.out.print(num[i]+" ");
            if(num[i] == x){
                System.out.println("x is found at index "+ i);
            }
        }
        //2D array
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int num[][] = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                num[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(num[i][j] == x){
                    System.out.println("x found at index ("+ i + ","+ j + ")");
                }
            }
        }
        //chapter: 2
        //Q1 - Calculate avg of 3 numbers
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a + b + c)/3;
        System.out.println(avg);

        //Q2 - Calculate area of square
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();

        int area = side*side;
        System.out.println(area);

        //Q3 - Calculate total cost of items
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();

        float gst = (a+b+c)*18/100;
        float total = (a+b+c)+gst;
        System.out.println(total);

        //loop question
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            int last = num % 10;
            sum = (sum * 10) + last;
            num = num/10;
        }
        System.out.println(sum);

        //Q - Write a program that reads a set of integers ,and then prints the sum of the even and odd integers.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int even = 0, odd = 0;
        while (i < n) {
            if(i % 2 == 0){
                even = even + i;
            }else{
                odd = odd + i;
            }
            i++;
        }
        System.out.println("Even sum is "+even+", and Odd sum is "+odd);

        //Q - Write a program to find the factorialof any number entered by the user.
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        System.out.println(f);
        
        //Q - pattern
        1 2 3 4 5 
        1 2 3 4 
        1 2 3 
        1 2 
        1 
        int n=5;
        for(int i=0; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //Q - pattern 
              1 
            2 2 2
          3 3 3 3 3
        4 4 4 4 4 4 4 

        int n = 4;
        int num =1;
        int sp = n-1;
        int st = 1;
        while (num<=n) {
            for(int i=0; i<sp; i++){
                System.out.print("  ");
            }
            for(int i=0; i<st; i++){
                System.out.print(num+" ");
            }
            st = st + 2;
            sp--;
            System.out.println();
            num++;
        }
         
    }
    //Functions and Methods
    public static void BinToDec(int BinNum){
        int num = BinNum;
        int pow = 0;
        int DecNum = 0;
        
        while (BinNum > 0) {
            int LastDigit = BinNum % 10;
            DecNum = DecNum + (LastDigit * (int)Math.pow(2, pow));

            pow++;
            BinNum = BinNum/10;
        }
        System.out.println("Decimal of "+num+" is "+DecNum);

    }
    public static void DectoBin(int num){
        int DecNum = num;
        int pow = 0;
        int BinNum = 0;

        while (num > 0) {
            int rem = num % 2;
            BinNum = BinNum + (rem * (int)Math.pow(10, pow));

            pow++;
            num = num / 2;
        }
        System.out.println("Binary conversion of "+DecNum+" is "+BinNum);
    }
    public static boolean IsPalindrome(int n){
        int num = n;
        int sum = 0;
        while (n > 0) {
            int a = n % 10;
            sum = sum*10 + a;
            n = n / 10;
        }
        if(num == sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        //BinToDec(110101);
        //DectoBin(12);
        /*int num = 12321;
        if(IsPalindrome(num)){
            System.out.println(num+" is Palindrome");
        }else{
            System.out.println(num+" is not Palindrome");
        }
    }
    
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 2;
        }
    }*/
    // public static int getLargest(int numbers[]){
    //     int largest =  Integer.MIN_VALUE; //- infinity
    //     int smallest = Integer.MAX_VALUE; //+ infinity
    //     for(int i=0; i<numbers.length; i++){
    //         if(largest < numbers[i]){
    //             largest = numbers[i];
    //         }
    //         if(smallest > numbers[i]){
    //             smallest =numbers[i];
    //         }
    //     }
    //     System.out.println("The Smallest number is " + smallest);
    //     return largest;
    // }
    
    public static void mergeArray(int[] nums1, int[] nums2) {
        int j=0;
        for(int i=0; i<nums1.length; i++){
                if(nums1[i] == 0){
                    nums1[i] = nums2[j];
                    j++;
                }
        }
        Arrays.sort(nums1);
        for(int i=0; i<nums1.length; i++){
            System.out.print(nums1[i]+" ");
        }
        System.out.println();
    }

    public static void pascalTriangle(int n) {
        int[][] ans = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j == 0 || i == j){
                    ans[i][j] = 1;
                }else{
                    ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
                }
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /* 
        //Array
        int marks[] = new int[5];
        int num[] = {1, 2, 3, 4};

        Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("chem: "+marks[0]);
        // System.out.println("phy: "+marks[1]);
        // System.out.println("math: "+marks[2]);
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Marks array before updation: ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        update(marks);
        System.out.println("\nMarks array after updation: ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }*/

        // int numbers[] = {2, 14, 16, 38, 21, 12, 6};
        // int largest = getLargest(numbers);
        // System.out.println("THe largest number is " + largest);

        // int nums1[] ={1, 2, 3, 0, 0, 0};
        // int nums2[] ={2, 5, 6};
        // mergeArray(nums1, nums2);

        int n=5;
        pascalTriangle(n);
    }
}
