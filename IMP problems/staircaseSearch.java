public class staircaseSearch {
    public static boolean searchELement(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        
        while(row <= matrix.length-1 && col >= 0){
            if(key == matrix[row][col]){
                System.out.println("key found at index ("+ row +","+ col +")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50}};
        int key = 48;
        searchELement(matrix, key);
    }
}
