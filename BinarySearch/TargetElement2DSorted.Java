

// Time complexity - n for Rows and n for Column Totao O(N)
// Space Complexity - O(1);

// Sorted Array in Row and Column Matrix
public class TargetElement2DSorted{

    public static void main(String[] args){
         int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
         }; 

         System.out.println(Array.toString(arr, 49));

    }

    static int[] search(int[][] matrix, int target){
        int r= 0;
        int c = matrix.length -1;

        while(r< matrix.length && c >=0){
             if(matrix[r][c] == target){
                return matrix[r][c];
             }

             if(matrix[r][c < target]){
                r++;
             } else{
                c--;
             }
        }
        return -1;
    }
}