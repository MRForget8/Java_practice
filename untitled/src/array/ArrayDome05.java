package array;

import static array.ArrayDome04.printArray;

public class ArrayDome05 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{3,4},{5,6},{7,8}};
        printArray(array[0]);
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]+" ");
            }
        }
    }
}
