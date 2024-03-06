package tests;

import static mcunit.Assertions.assertTrue;

import mcunit.TestCase;

public class AddTwoIntegers extends TestCase {

    int x;
    int y;

    @Override
    protected void setUp() {
        x = 1;
        y = 1;
    }

    @Override
    protected void test() {
        assertTrue(x + y == 2);
    }

}
