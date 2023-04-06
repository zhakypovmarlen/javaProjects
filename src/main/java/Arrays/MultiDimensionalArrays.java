package Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int [] oneD = {1,2,3};
        int [][] twoD = {{1,2,3}, {1,2,3}};

        int [][][] threeD = {
                { {4,2,1}, oneD, {1} },
                {{4,5}, {1,2,3,4} },
                {oneD, oneD, oneD},
                twoD
        };

        int [][][][] fourD = {  threeD, {twoD}, {{oneD}}};

        System.out.println(threeD[1][1][2]); //3
        System.out.println(threeD[0][0][2]); //1
        System.out.println(threeD[1][0][1]); //5

        for(int a = 0; a < threeD.length; a++){
            for(int b = 0; b < threeD[a].length; b++){
                for(int c = 0; c < threeD[a][b].length; c++){
                    System.out.println(threeD[a][b][c]);
                }
            }
        }

        for(int a = 0; a < fourD.length; a++){
            for(int b = 0; b < fourD[a].length; b++){
                for (int c = 0; c < fourD[a][b].length; c++){
                    for (int d = 0; d < fourD[a][b][c].length; d++){
                        System.out.println(fourD[a][b][c][d]);
                    }
                }
            }
        }
    }
}
