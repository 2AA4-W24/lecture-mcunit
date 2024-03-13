package mcunit;

import java.lang.reflect.Method;

public class TestFactory {

    private static final String TEST_PREFIX = "test_";


    public Test build(Class suite) {
        TestSuite test = new TestSuite();
        for (Method m: suite.getMethods()) {
            // if(m.getName().startsWith(TEST_PREFIX)) {
            if(m.isAnnotationPresent(mcunit.tags.Test.class)) {
                test.add(new TestCase(suite, m));
            }
        }
        return test;
    }


}
