package practic_1;

/**
 * Created by student on 11/1/2016.
 */
public class ArraySum {

    int[] ints;

    public ArraySum( int [] a) {
        ints = a;
    }


    public static int sum(int[] ints) {
        int result = 0;

        for (int anInt : ints) {
            result += anInt;
        }

        return result;

    }

    public int sum() {
        int result = 0;

        for (int anInt : ints) {
            result += anInt;
        }

        return result;
    }



}
