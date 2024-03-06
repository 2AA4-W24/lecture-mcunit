package tests;

import static mcunit.Assertions.assertTrue;

import mcunit.TestCase;

public class AddTwoIntegers extends TestCase {

    int x = 1;
    int y = 1;

    @Override
    protected void test() {
        assertTrue(x + y == 2);
    }

}
