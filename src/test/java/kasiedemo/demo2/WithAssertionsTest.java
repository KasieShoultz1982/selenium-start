package kasiedemo.demo2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class WithAssertionsTest {

    @Test
    public void firstAssertion() {
        assertEquals(1, 2);
    }

    @Test
    public void secondAssertion() {
        assertEquals(45,45);
    }
}