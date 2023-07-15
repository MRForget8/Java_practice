package array;

public class ArrayDome02 {
    public static void main(String[] args) {
        //静态初始化 创建+赋值
        //增强for循环写法
        //int[] a = {1,2,3,4,5,6,7,8,9};
        //Man[] mans = {new Man()};
        //for (int j : a) {
            //System.out.println(j);
        //}
        //普通for循环写法
        int[] a = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //溢出
        //System.out.println(a[9]);

        //动态初始化
//        int[] b = new int[10];
//        b[0] = 10;
//        for (int i = 0; i < b.length; i++){
//            System.out.println(b[i]);
//        }
    }
}
