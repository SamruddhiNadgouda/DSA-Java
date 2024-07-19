public class tilingProblem {
    public static int tiling(int n){ // 2 x n
        //base case 
        if(n == 0 || n ==1){
            return 1;
        }
        //kaam
        //vertical choice
        int f1 = tiling(n-1);

        //horizontal choice 
        int f2 = tiling(n-2);

        int totalWays = f1+f2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tiling(2));
    }
}
