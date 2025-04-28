package simple;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {

    @Test
    public void testAddition() {
        int a = 2;
        int b = 3;
        int sum = a + b;
        Assert.assertEquals("Сложение должно быть правильным", 5, sum);
    }
}
