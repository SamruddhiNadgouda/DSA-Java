import java.util.*;
public class bitManipulation {
    public static void main(String[] args) {
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(~5);
        // System.out.println(~0);
        // System.out.println(5<<2);
        // System.out.println(6>>1);

        //Q1: check if a number is odd or even
        // oddOrEven(3);
        // oddOrEven(10);
        //System.out.println(getIthBit(10, 2));
        // System.out.println(setIthBit(10, 2));
        //System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 2, 1));
        //System.out.println(claerIbits(15, 2));
        // System.out.println(clearRangeBit(10, 2, 4));
        //Q2: check a number is power of 2 or not
        // System.out.println(isPowerOf2(15));

        //Q3: Count set bits in a number
        // System.out.println(countSetBits(10));

        //Q4: Fast exponentaition
        // System.out.println(fastExpo(4, 12));

        //Q: Swapping two numbers
        // int x=3, y=4;
        // System.out.println("before swapping, "+x+" and "+y);
        // x = x^y;
        // y = x^y;
        // x = x^y;
        // System.out.println("after swapping, "+x+" and "+y);

        //Convert uppercase to lowercase
        for(char i ='A'; i <='Z'; i++){
            System.out.print((char)(i | ' '));
        }
    }
        
    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n > 0){
            if((n & 1) != 0){//check lsb=1
                ans = ans * a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        } else{
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newbit){
        // if(newbit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newbit<<i;
        return n | bitMask;
    }
    public static int claerIbits(int n, int i){
        int bitMask = ( ~0)<<i;
        return n & bitMask;
    }
    public static int clearRangeBit(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static boolean isPowerOf2(int n){
        return (n&(n-1)) == 0;
    }
    public static int countSetBits(int n){
        int count = 0;
        while (n > 0) {
            if((n & 1) != 0){
                count++;
            }
            n= n >> 1;
        }
        return count;
    }
}
