package mcunit;

import java.util.ArrayList;
import java.util.List;

public class TestReport {

    private final List<TestResult> results = new ArrayList<>();

    public void collect(TestResult res) {
        this.results.add(res);
    }

    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        for(TestResult r: results) {
            buff.append(r.toString()).append("\n");
        }
        return buff.toString();
    }
}
