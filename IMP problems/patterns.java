import java.util.*;
public class patterns{
    public static void main(String args[]){
        //rectangular pattern
        /* 
        *****
        *****
        *****
        *****
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println(); //print nextline space
        } */

        //pattern
        /* ****
           *  *
           *  *
           **** 
        int n=4;
        int m=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        //pattern
        /*
         * 
         * *
         * * *
         * * * * 
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //pattern
        /*
         * * * *
         * * *
         * *
         *  
        for(int i=1; i<=4; i++){
            for(int j=i; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //or
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //pattern
        /*
            *
           **
          ***
         **** 
        int n=4;
        for(int i=1; i<=n; i++){
            //space print
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern
        /*
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         

        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("\n");

         1 2 3 4 5
         1 2 3 4
         1 2 3 
         1 2
         1
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        /*
         1 
         0 1
         1 0 1
         0 1 0 1
         1 0 1 0 1
         

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum=i+j;
                if(sum %2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        } 

        //Q - pattern
         *             *
         * *         * *
         * * *     * * *
         * * * * * * * * 
         * * * * * * * *
         * * *     * * *
         * *         * *
         *             *  
         
        int n =4;
        int num = 1;
        int st = 1;
        int sp = 2*n - 2;
        while(num <= 2*n){
            for(int i = 0; i<st; i++){
                System.out.print("* ");
            }
            for(int i =0; i<sp; i++){
                System.out.print("  ");
            }
            for(int i=0; i<st; i++){
                System.out.print("* ");
            }
            if(num < n){
                st++;
                sp = sp - 2;
            }else if(num > n){
                st--;
                sp = sp + 2;
            }
            System.out.println();
            num++;
        }
        //Q - pattern
              * 
            * * *
          * * * * *
        * * * * * * *
          * * * * * 
            * * *
              * 

        int n = 4;
        int num = 1;
        int sp = n-1;
        int st = 1;
        while(num <= 2*n - 1){
            for(int i =0; i<sp; i++){
                System.out.print("  ");
            }
            for(int i =0; i<st; i++){
                System.out.print("* ");
            }
            if(num < n){
                st = st + 2;
                sp--;
            }else {
                st = st - 2;
                sp++;
            }
            System.out.println();
            num++;
        }
        
        //Q - pattern
                * * * * 
              *     *
            *     *
          * * * *  

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int osp = n - 1;
        int isp = n - 2;
        while(num <= n){
            if(num == 1 || num == n){
                for(int i=0; i<osp; i++){
                    System.out.print("  ");
                }
                for(int i=0; i<n; i++){
                    System.out.print("* ");
                }
            }
            else{
                //outer space
                for(int i=0; i<osp; i++){
                    System.out.print("  ");
                }
                //one star
                System.out.print("* ");
                //inner space
                for(int i=0; i<isp; i++){
                    System.out.print("  ");
                }
                //one star
                System.out.print("* ");
            }
            System.out.println();
            //osp++;
            osp--;
            num++;
        }
        //Q - pattern
            * * * * *
              *       *
                *       *
                  *       *
                    * * * * * 

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int osp = n - 1;
        int isp = n - 2;
        while(num <= n){
            if(num == 1 || num == n){
                for(int i=0; i<osp; i++){
                    System.out.print("  ");
                }
                for(int i=0; i<n; i++){
                    System.out.print("* ");
                }
            }
            else{
                //outer space
                for(int i=0; i<osp; i++){
                    System.out.print("  ");
                }
                //one star
                System.out.print("* ");
                //inner space
                for(int i=0; i<isp; i++){
                    System.out.print("  ");
                }
                //one star
                System.out.print("* ");
            }
            System.out.println();
            osp++;
            num++;
        } 
        //Q - pattern
                1 
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
          int n = 4;
          int num =1;
          int sp = n-1;
          int st = 1;
          while (num<=n) {
              for(int i=0; i<sp; i++){
                  System.out.print("  ");
              }
              int curr = num;
              for(int i=0; i<st; i++){
                  System.out.print(curr+" ");
                  if(i < st/2){
                      curr--;
                  }else{
                      curr++;
                  }
              }
              st = st + 2;
              sp--;
              System.out.println();
              num++;
          }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int osp = n - 1;
        //int isp = n - 2;
        while(num <= n){
            for(int i=0; i<osp; i++){
                System.out.print("  ");
            }
            for(int i=0; i<n; i++){
                System.out.print("* ");
            }
            System.out.println();
            osp--;
            num++;
        }*/
        //Q - pattern
        /*      1
               2 2
              3 3 3
             4 4 4 4
            5 5 5 5 5
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //4
        int space = n-1;
        for(int i=1; i<=n; i++){
            for(int k=0; k<space; k++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1; j++){
                if(j%2 == 0){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            space--;
            System.out.println();
        }
    }
}        
