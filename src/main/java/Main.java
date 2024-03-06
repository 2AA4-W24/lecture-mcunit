import static mcunit.Assertions.*;

import mcunit.TestCase;
import tests.AddTwoIntegers;
import tests.SubtractTwoIntegers;
import tests.ThrowAnException;

public class Main {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        // passed
        TestCase t1 = new AddTwoIntegers();
        t1.run();

        //failed
        TestCase t2 = new SubtractTwoIntegers();
        t2.run();

        // error
        TestCase t3 = new ThrowAnException();
        t3.run();

    }

}