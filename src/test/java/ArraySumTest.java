import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import practic_1.ArraySum;

/**
 * Created by student on 11/1/2016.
 */
public class ArraySumTest {

    ArraySum arraySum;


    @Before
    public void createArraySum() {
        int[] w = {1, 2, 3, 4, 5};
        arraySum = new ArraySum(w);

    }

    @Test
    public void testSum() throws Exception {

        int[] w = {1, 2, 3, 4, 5};
        //practic_1.ArraySum.sum(w);
        Assert.assertEquals(15, ArraySum.sum(w));

    }

    @Test
    public void testSum1() throws Exception {
        Assert.assertEquals(15, arraySum.sum());
    }

    @Test(expected = NullPointerException.class)
    public void testSum2(){
        Assert.assertEquals(15, ArraySum.sum(null));
    }

}


