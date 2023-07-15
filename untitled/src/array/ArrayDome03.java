package array;

public class ArrayDome03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
        //打印所有元素
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum = sum + arrays[i];
        }
        System.out.println(sum);
        //查找最大元素
        int max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (max < arrays[i]){
                max = arrays[i];
            }
        }
        System.out.println(max);
    }
}
