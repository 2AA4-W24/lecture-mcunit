package tests;

import mcunit.TestCase;
import mcunit.TestSuite;
import mcunit.tags.Before;
import mcunit.tags.Suite;
import mcunit.tags.Test;

import static mcunit.Assertions.assertEquals;

@Suite
public class IntegerTests {


    private int x, y;

    @Before
    public void anAwesomeMethod() {
        this.x = 1;
    }

    @Before
    public void anAwesomeMethodTwo() {
        this.y = 1;
    }

    @Test
    public void addTwoIntegers() {
        assertEquals(x + y, 2); // should pass
    }

    @Test
    public void subtractTwoIntegers() {
        assertEquals(x - y, 1); // Should fail (assertion error)
    }

    @Test
    public void throwAnException() {
        throw new RuntimeException("Unexpected Error!");
    }

}
