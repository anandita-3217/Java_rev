import java.util.Scanner;

public class Patterns {

    public static void StarRightTriangle(int n){
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
        for(int i = 0;i<n;i++){
            for(int j = 0 ;j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void StarLeftTriangle(int n){
//           *
//         * *
//       * * *
//     * * * *
//   * * * * *
        for(int i = 0;i < n; i++){
            for(int j = 2*(n-i);j>=0;j--){
                System.out.print(" ");
            }
            for(int j = 0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void NumPyramid(int n){

        int x = 0;
        for (int i = 1;i<=n;i++){
            x =i - 1;
            for(int j = i;j<=n-1;j++){
                System.out.print(" ");
                System.out.print("  ");
            }
            for (int j = 0; j <= x; j++)
                System.out.print((i + j) < 10
                        ? (i + j) + "  "
                        : (i + j) + " ");

            for (int j = 1; j <= x; j++)
                System.out.print((i + x- j) < 10
                        ? (i + x- j) + "  "
                        : (i + x- j) + " ");

            System.out.println();
        }
    }
    public static void RevPyramid(int n){
        int i = n ,j;
        while(i>0){
            j = 0;
            while(j++<n-i){
                System.out.print(" ");

            }
            j = 0;

            while (j++<(i*2)-1){
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }

    public static void Pyramid(int number){
        int i = 1, j;

        // Nested while loops
        // Outer loop

        // Till condition holds true
        while (i <= number) {
            j = 0;

            // Inner loop
            // Condition check for printing spaces
            while (j++ < number - i) {
                // Print whitespaces
                System.out.print(" ");
            }

            j = 0;

            // Inner loop
            // Condition check for printing stars
            while (j++ < (i * 2) - 1) {
                // Print star
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();

            // Incrementing counter to build the upright pyramid
            i++;
        }
    }
    public static void UpperStarTriangle(int n){
        for(int i = 0;i<=n;i++){
            for (int j = 0;j <=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 0; k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static int[][]  SpiralMatrix(int n){
        int[][] matrix = new int[n][n];

        int row = 0;
        int col =0;
        int[][] directions ={{0,1},{1,0},{0,-1},{-1,0}};
        int dirIndex = 0;

        for(int val =1; val < n*n ; val++){
            matrix[row][col] = val;

            int nextRow = row + directions[dirIndex][0];
            int nextCol = col + directions[dirIndex][1];

            if (nextRow < 0 || nextCol < 0 || nextRow >= n || nextCol >= n || matrix[nextRow][nextCol] > 0) {

                dirIndex = (dirIndex + 1) % 4;
                // Calculate the position again after changing direction.
                nextRow = row + directions[dirIndex][0];
                nextCol = col + directions[dirIndex][1];
            }
            row = nextRow;
            col = nextCol;


        }

        return  matrix;
    }

    public static void Diamond(int n){
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = i; j <= n-1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = 1; i < n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void DownwardRightTriangle(int n){
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void DownwardPyramidMirror(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void PascalsTriangle(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            int c = 1;
            for (int k = 1; k <= i ; k++) {
                System.out.print(c+ " ");
                c = c * (i -k)/k;
            }
            System.out.println();

        }
    }

    public static void HollowRectangle( int rows, int cols) {

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || i == rows || j ==  cols)
                    System.out.print("*");

                else
                    System.out.print(" ");


            }
            System.out.println();
        }

    }

    public static void HollowSquare(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

//    Star square pattern with diagonals

    public static void SquareWithDiagonals(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i == 1|| i == n || j == 1|| j ==n|| j == (n-i+1) || i == j )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static  void FilppedRightTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 2*(n-i); j >= 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        int n = 4;//sc.nextInt();
        StarRightTriangle(n);
        StarLeftTriangle(n);
            NumPyramid(n);
        RevPyramid(n);
        Pyramid(n);
        UpperStarTriangle(n);
        int[][] spiralMatrix = SpiralMatrix(n);
        for (int i = 0; i < spiralMatrix.length; i++) {
            for (int j = 0; j < spiralMatrix[i].length; j++) {
                System.out.print(spiralMatrix[i][j] + "\t"); // Print with tabs for better alignment
            }
            System.out.println(); // New line after each row
        }
        Diamond(n);
        DownwardRightTriangle(n);
        DownwardPyramidMirror(n);

        PascalsTriangle(n);
        HollowRectangle(8,2);
        HollowSquare(n);

        SquareWithDiagonals(12);

        FilppedRightTriangle(4);




    }


}
