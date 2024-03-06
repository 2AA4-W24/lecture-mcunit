package tests;

import static mcunit.Assertions.assertTrue;

import mcunit.TestCase;

public class ThrowAnException extends TestCase {

    @Override
    protected void test() {
        throw new RuntimeException("Something went wrong");
    }

}
