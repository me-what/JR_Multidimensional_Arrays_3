public class Main {
    public static void main(String[] args) {
        int [][] twoDimArray1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] twoDimArray2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        int[][]twoDimArray3 = new int [twoDimArray1.length][twoDimArray2[0].length];
        for (int i=0; i<twoDimArray3[0].length; i++)
            for (int j=0; j<twoDimArray3.length; j++)
                for (int k=0; k<twoDimArray1[0].length; k++)
                    twoDimArray3[i][j] = twoDimArray3[i][j] + twoDimArray1[i][k] * twoDimArray2[k][j];

        for (int i = 0; i < twoDimArray3.length; i++) {
            for (int j = 0; j < twoDimArray3[0].length; j++) {
                System.out.print(" " + twoDimArray3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        int [][] twoDimArray = new int[5][];
        twoDimArray[0] = new int[]{1, 2, 3, 4, 5};
        twoDimArray[1] = new int[]{1,2,3,4};
        twoDimArray[2] = new int[]{1,2,3};
        twoDimArray[3] = new int[]{1,2};
        twoDimArray[4] = new int[]{1};

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        boolean[][][] parkingLot = new boolean[3][2][5];
        parkingLot[0][1][0] = true;
        parkingLot[0][1][3] = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = " + parkingLot[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
    }
}