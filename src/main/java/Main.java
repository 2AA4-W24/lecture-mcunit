import static mcunit.Assertions.*;

public class Main {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        System.out.println("Test case #1 = 1 + 1 = 2");
        try {
            assertTrue(x + y == 2);
            System.out.println("PASSED");
        } catch (AssertionError ae) {
            System.out.println("FAILED");
        }

        System.out.println("Test case #2 = 1 + 2 != 2");
        try {
            assertFalse(x + 2 == 2);
            System.out.println("PASSED");
        } catch (AssertionError ae) {
            System.out.println("FAILED");
        }

        System.out.println("Test case #3 = 1 + 1 == 2");
        try {
            assertEquals(new Integer(1), new Integer(1));
            System.out.println("PASSED");
        } catch (AssertionError ae) {
            System.out.println("FAILED");
        }

    }

}