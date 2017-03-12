import org.junit.Assert;
import org.junit.Test;
import practic_1.ArrayProd;

/**
 * Created by student on 11/1/2016.
 */
public class ArrayProdTest {

    @Test
    public void testMultArray() throws Exception {

        int[] w = {1, 2, 3, 4, 5};

        Assert.assertEquals(120, ArrayProd.multArray(w));

    }
}