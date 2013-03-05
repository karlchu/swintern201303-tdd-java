import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: kchu
 * Date: 5/03/13
 * Time: 4:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccumulatorTest {
    @Test
    public void shouldBeEmpty_WhenAccumulatorIsCreated() throws Exception {
        Accumulator accumulator = new Accumulator();

        assertThat(accumulator.getLineItemsCount(), equalTo(0));
    }

    @Test
    public void quantityShouldBeOne_WhenAddedOneThingToIt() throws Exception {
        Accumulator accumulator = new Accumulator();

        String productCode = "whatever";
        accumulator.addToCart(productCode);

        assertThat(accumulator.getLineItemsCount(), equalTo(1));
    }

    @Test
    public void shouldGetQuantityOfTwo_WhenIAddedSameProductTwice() throws Exception {
        Accumulator accumulator = new Accumulator();

        String productCode = "whatever";
        accumulator.addToCart(productCode);
        accumulator.addToCart(productCode);

        assertThat(accumulator.getLineItemsCount(), equalTo(1));
    }

    @Test
    public void shouldGetProductQuantity_WhenIAddedAProduct() throws Exception {
        Accumulator accumulator = new Accumulator();

        String productCode = "whatever";
        accumulator.addToCart(productCode);

        assertThat(accumulator.getProductQuantity(productCode), equalTo(1));
    }

    @Test
    public void shouldReturnZero_WhenGetProductQuantityThatHasNotBeenAdded() throws Exception {
        Accumulator accumulator = new Accumulator();

        assertThat(accumulator.getProductQuantity("non exist product code"), equalTo(0));
    }
}
