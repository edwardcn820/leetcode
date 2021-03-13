import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {
    @Test
    public void testReverseInteger() {
        Assertions.assertEquals(321, ReverseInteger.reverseInteger(123));
        Assertions.assertEquals(112, ReverseInteger.reverseInteger(211));
        Assertions.assertEquals(-321, ReverseInteger.reverseInteger(-123));
        Assertions.assertEquals(-1, ReverseInteger.reverseInteger(1999999999));
    }
}
