package mcunit;

public class TestResult {

    private final String testName;
    private STATUS testStatus;

    public TestResult(String testName) {
        this.testName = testName;
    }

    public void record(STATUS status) {
        this.testStatus = status;
    }

    @Override
    public String toString() {
        return testName + ": " + testStatus;
    }


}
