package method;

public class Dome02 {
    public static void main(String[] args) {
        int com = compare(2,2);
        System.out.println(com);
    }

    //比大小
    public static int compare(int a, int b) {

        int result = 0;

        if (a > b) {result = a;}
        else if (b > a) {result =  b;}
        else if (a == b) {
            System.out.println("a == b");
            return 0;
        }
        return result;
    }
}
