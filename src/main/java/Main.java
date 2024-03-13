import mcunit.Test;
import mcunit.TestFactory;
import mcunit.TestReport;
import tests.IntegerTests;


public class Main {

    public static void main(String[] args) {
        System.out.println("# 2AA4 - McUnit Demo");

        TestReport report = new TestReport();
        TestFactory factory= new TestFactory();
        Test integerTests = factory.build(IntegerTests.class);
        integerTests.run(report);
        System.out.println(report);
    }

}
