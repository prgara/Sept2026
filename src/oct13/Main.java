package oct13;

public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[3][4]; // 3 rows & 4 columns

        arr[0][0] = 9;
        arr[0][1] = 8;
        arr[0][2] = 7;
        arr[0][3] = 10;
        arr[1][0] = 10;
        arr[1][1] = 9;
        arr[1][2] = 9;
        arr[1][3] = 8;
        arr[2][0] = 10;
        arr[2][1] = 9;
        arr[2][2] = 9;
        arr[2][3] = 8;

        System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1]+ " ");
        System.out.print(arr[0][2]+ " ");
        System.out.print(arr[0][3]+ " ");
        System.out.println();
        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1]+ " ");
        System.out.print(arr[1][2]+ " ");
        System.out.print(arr[1][3]+ " ");
        System.out.println();
        System.out.print(arr[2][0] + " ");
        System.out.print(arr[2][1]+ " ");
        System.out.print(arr[2][2]+ " ");
        System.out.print(arr[2][3]+ " ");
        System.out.println();

// array of arrays
        int[][] grid = {
                {1,2,3}, // row 1
                {4,5,6}, // row 2
                {7,8,9} //  row 3
        };

        System.out.print(grid[0][0] + " ");
        System.out.print(grid[0][1]+ " ");
        System.out.print(grid[0][2]+ " ");
        System.out.println();
        System.out.print(grid[1][0]+ " ");
        System.out.print(grid[1][1]+ " ");
        System.out.print(grid[1][2]+ " ");
        System.out.println();
        System.out.println("===================================");
        System.out.println("Rows are " + arr.length);
        System.out.println("Cols are " + arr[1].length);


        System.out.println("================2D array Loops================");

        for (int i = 0; i < grid.length; i++) { // accesing rows
            for (int j = 0; j < grid[i].length; j++) {// accessing col
                System.out.print(grid[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("============ For each loop===============");
        for (int[] row :grid){
            for (int ele :row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }



    }
}
