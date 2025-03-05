public class AddTwoMatrics {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] result = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
       for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }

    }
    
}
