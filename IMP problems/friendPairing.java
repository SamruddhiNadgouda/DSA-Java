public class friendPairing {
    public static int pairingProblem(int n){
        if (n ==1 || n == 2){
            return n;
        }
        //choice
        //single
        int f1 = pairingProblem(n-1);

        //pair
        int f2 = pairingProblem(n-2);
        int pairWays = (n-1)*f2;

        //totalWays
        int totalWays = f1 + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(pairingProblem(4));
    }
}
