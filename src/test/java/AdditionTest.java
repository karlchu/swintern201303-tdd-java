import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class AdditionTest {
    @Test
    public void zeroPlusZeroShouldEqualZero() throws Exception {
        // Action
        int result = new Addition().add(0, 0);

        // Assertion
        assertThat(result, equalTo(0));
    }

    @Test
    public void onePlusTwoShouldEqualThree() throws Exception {
        // Action
        int result = new Addition().add(1, 2);

        // Assertion
        assertThat(result, equalTo(3));
    }

    @Test
    public void anythingPlusZeroShouldEqualToItself() throws Exception {
        // Assertion
        assertThat(new Addition().add(1, 0), equalTo(1));
        assertThat(new Addition().add(10, 0), equalTo(10));
        assertThat(new Addition().add(35, 0), equalTo(35));
    }
}
