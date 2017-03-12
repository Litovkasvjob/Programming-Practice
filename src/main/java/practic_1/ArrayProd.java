package practic_1;

/**
 * Created by student on 11/1/2016.
 */
public class ArrayProd {

    public static void main(String[] args) {
        int[] w = {1, 2, 3, 4, 5};
        System.out.println(ArrayProd.multArray(w));
    }

    public static int multArray(int[] w) {
        int result = 1;

        for (int i : w) {
            result *= i;
        }
        return result;
    }

}
