import static mcunit.Assertions.*;

import mcunit.TestCase;
import mcunit.TestReport;
import tests.AddTwoIntegers;
import tests.SubtractTwoIntegers;
import tests.ThrowAnException;

public class Main {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        TestReport report = new TestReport();

        // passed
        TestCase t1 = new AddTwoIntegers();
        report.collect(t1.run());

        //failed
        TestCase t2 = new SubtractTwoIntegers();
        report.collect(t2.run());

        // error
        TestCase t3 = new ThrowAnException();
        report.collect(t3.run());

        System.out.println(report);

    }

}