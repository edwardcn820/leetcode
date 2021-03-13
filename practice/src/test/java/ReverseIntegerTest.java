import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {
    @Test
    public void testReverseInteger() {
        Assertions.assertEquals(321, ReverseInteger.reverseInteger(123));
        Assertions.assertEquals(112, ReverseInteger.reverseInteger(211));
        Assertions.assertEquals(-321, ReverseInteger.reverseInteger(-123));
        Assertions.assertEquals(0, ReverseInteger.reverseInteger(1999999999));
        Assertions.assertEquals(0, ReverseInteger.reverseInteger(1534236469));
        Assertions.assertEquals(0, ReverseInteger.reverseInteger(-2147483648));
        Assertions.assertEquals(-2143847412, ReverseInteger.reverseInteger(-2147483412));
    }
}
