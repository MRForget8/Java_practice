package array;

public class ArrayDome04 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};

        printArray(arrays);
        reverse(arrays);
    }

    //打印数组元素
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    //反转数组
    public static void reverse(int[] arrays) {
        for (int i = arrays.length - 1; i >= 0; i--) {
            System.out.println(arrays[i]);
        }
    }
}
