import java.util.*;
public class placementProblems{
    //Greatest common divisor
   /* public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
 
 
        while(n1 != n2) { 
            if(n1>n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : "+ n2);
    } */
    
    //Fibonacci number
    /*public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int a = 0, b = 1;
           
        System.out.print(a+" ");
       
        if(n > 1) {
            //find nth term
            for(int i=2; i<=n; i++) {
                System.out.print(b+" ");
                //the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
    } */
    //factorial numbers
    /* public static int Factorial(int n){
        if(n<0){
            System.out.println("invalid");
            return n;
        }
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        };
        return f;
    }
    //Binomial Coefficient
    public static int Binomial(int n, int r){
        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int nr_fact = Factorial(n-r);
        int binomial = n_fact/(r_fact * nr_fact);
        return binomial;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();

        int bioCoff = Binomial(n, r);
        System.out.println("Binomial coeffient = "+bioCoff);
    } */
    //Prime Numbers
    /*public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        /*for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
        //Optimized prime
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primeRange(int n){
        for(int i=2; i<n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        //System.out.println(isPrime(18));
        primeRange(18);
    }*/

    //Reverse a array
    /*public static void ReverseArray(int numbers[]){
        int start = 0, end = numbers.length-1;
        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 14, 16, 38, 21, 12, 6};
        ReverseArray(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    //Pairs in a array
    public static void pairsArray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 1, 8};
        pairsArray(numbers);
    }
    
    //Print subarrays
    public static void subarrays(int numbers[]){
        int total = 0;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                total++;
            }
            System.out.println();
        }
        System.out.println("total subarrays are "+total);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        subarrays(numbers);
    }*/

    //Print max sum of subarrays(brute sum)
    /*public static void MaxSumSubarrays(int numbers[]){
        //I) Brute force Sum
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; //-infinity

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++){
                    currSum +=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum of subarrays are "+maxSum);*/
        //II) Prefix Sum
        /*int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0]=numbers[0];
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum =  start ==0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum of subarrays are "+maxSum);
        //III) Kadane's Algorithm
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Subarray Sum is "+ maxSum);

    }
    public static void main(String[] args) {
        //int numbers[] = {2, 4, 6, 8, 10};
        //int numbers[] = {1, -2, 6, -1, 3};
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        MaxSumSubarrays(numbers);
    }*/

    //Concatenation of array
    /*public static int[] concatenationArray(int numbers[]){
        int n = numbers.length;
        int answer[] = new int[2 * n];

        for(int i=0; i<n ; i++){
            answer[i] = numbers[i];
            answer[i+n] = numbers[i];
        }
        return answer;
        //System.out.println("Concatenation of array: "+answer);
    }
    public static void main(String[] args) {
        int numbers[] = {3, 1, 8};
        int[] ans = concatenationArray(numbers);
        System.out.println("Concatenated Array: " + Arrays.toString(ans));
    }*/
    //Trapping Rainwater
    /*public static int trappedRainwater(int height[]){
        //calculate left-max boundary - array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //calculate right-max boundary - array
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        int trappedWater = 0;
        //loop
        for(int i=0; i<height.length; i++){
            //waterlevel = min(leftmax boundary, rightmax boundary)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            //trapped water =  waterlevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        //int height[] = {4, 2, 0, 6, 3, 2, 5};
        int height[] = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedRainwater(height));
    }*/
    //Buy and Sell Stocks
    /*public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){ //profit
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit); //combined profit
            }else{
                buyPrice = prices[i]; //buying prices
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }*/
    public static int rotatedArray(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(numbers[mid] == key){
                return mid;
            }else if(numbers[mid] > key){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 3, 5, 6, 7, 9};
        System.out.println("number found at index "+rotatedArray(numbers, 5));
    }
}
