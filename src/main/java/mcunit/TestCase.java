package mcunit;

public abstract class TestCase {


    public final void run() {
        System.out.println("# " + this.getClass().getCanonicalName());
        try {
            test();
            System.out.println("PASSED");
        } catch (AssertionError ae) {
            System.out.println("FAILED");
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

    abstract protected void test();


}
