package java_3;

public class RandomArray_3_10 {
    public static void main(String[] args) {
        int array [][] = new int [4][4];
        int i = 0;

        while (i < 10){
            int x = (int)(Math.random()*10 + 1);
            int row = (int)(Math.random()*4);
            int column = (int)(Math.random()*4);
            if(array[row][column] == 0) {
                array[row][column] = x;
                i++;
            }
        }

        for (int j = 0; j  <= 3; j++){
            for (int k = 0; k <= 3; k++){
                System.out.print(array[j][k] + "    ");
            }
            System.out.println();
        }
    }
}

